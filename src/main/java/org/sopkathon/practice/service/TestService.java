package org.sopkathon.practice.service;

import lombok.RequiredArgsConstructor;
import org.sopkathon.practice.domain.Test;
import org.sopkathon.practice.external.S3Service;
import org.sopkathon.practice.repository.TestRepository;
import org.sopkathon.practice.service.dto.TestCreateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;
    private final S3Service s3Service;
    private static final String TEST_S3_UPLOAD_FOLDER = "test/";
    @Transactional
    public String create(TestCreateRequest testCreateRequest){
        try {
            Test test = testRepository.save(Test.create(
                    testCreateRequest.category(),
                    s3Service.uploadImage(TEST_S3_UPLOAD_FOLDER, testCreateRequest.image()),
                    testCreateRequest.content()
            ));
            return test.getId().toString();
        } catch (RuntimeException | IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
