package com.example.spring_study.loginStudy.repository;

import com.example.spring_study.loginStudy.Entity.UserEntity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemoryUserRepository {

    @Autowired
    UserRepository userRepository;

    @Test
    public void InsertDummies(){

        UserEntity userEntity = UserEntity.builder().
                id(0)
                .userId("abcd")
                .userPwd("1234")
                .userEmail("abcd@email.com")
                .userPhone("010-0000-0000")
                .build();

        userRepository.save(userEntity);
    }
}
