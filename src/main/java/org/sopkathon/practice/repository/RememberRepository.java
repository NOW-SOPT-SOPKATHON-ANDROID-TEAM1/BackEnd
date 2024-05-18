package org.sopkathon.practice.repository;

import org.sopkathon.practice.domain.Remember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RememberRepository extends JpaRepository<Remember, Long> {
}
