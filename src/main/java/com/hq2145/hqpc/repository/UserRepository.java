package com.hq2145.hqpc.repository;

import com.hq2145.hqpc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    User findByUsernameAndEnableTrue(String username);
    Optional<User> findByIdAndEnableTrue(Long id);
}