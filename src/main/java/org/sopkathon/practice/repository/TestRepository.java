package org.sopkathon.practice.repository;

import org.sopkathon.practice.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
