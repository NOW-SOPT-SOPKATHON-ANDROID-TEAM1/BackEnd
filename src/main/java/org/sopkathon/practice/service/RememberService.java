package org.sopkathon.practice.service;

import lombok.RequiredArgsConstructor;
import org.sopkathon.practice.domain.Remember;
import org.sopkathon.practice.external.S3Service;
import org.sopkathon.practice.repository.RememberRepository;
import org.sopkathon.practice.service.dto.RememberFindDto;
import org.sopkathon.practice.service.dto.TestCreateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RememberService {
    private final RememberRepository rememberRepository;
    private final S3Service s3Service;
    private static final String TEST_S3_UPLOAD_FOLDER = "test/";
    @Transactional
    public String create(TestCreateRequest testCreateRequest){
        try {
            Remember test = rememberRepository.save(Remember.create(

                    s3Service.uploadImage(TEST_S3_UPLOAD_FOLDER, testCreateRequest.image()),
                    testCreateRequest.caption()
            ));
            return test.getId().toString();
        } catch (RuntimeException | IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }


    public RememberFindDto getRemember() {
        Random random = new Random();
        long rememberId = 1 + random.nextInt(5); // 1부터 10 사이의 랜덤 값 생성

        Optional<Remember> rememberOptional = rememberRepository.findById(rememberId);
        if (rememberOptional.isPresent()) {
            Remember remember = rememberOptional.get();
            return RememberFindDto.of(remember);
        } else {
            // Handle the case where the rememberId does not exist in the database
            // For this example, we return null or you can throw a custom exception
            return null;
        }
    }

    public List<RememberFindDto> getAllRemembers() {
        List<Remember> remembers = rememberRepository.findAll();
        return remembers.stream()
                .map(RememberFindDto::of)
                .collect(Collectors.toList());
    }


}
