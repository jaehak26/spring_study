package com.example.spring_study.loginStudy.repository;

import com.example.spring_study.loginStudy.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//상속만 하면 끝남
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUserId(String userId);



}
