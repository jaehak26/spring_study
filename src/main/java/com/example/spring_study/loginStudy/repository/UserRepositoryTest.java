package com.example.spring_study.loginStudy.repository;

import com.example.spring_study.loginStudy.Entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    //DB insert test
    //DB 업데이트와 insert는 구조가 동일함
    //primary key를 확인하고 이미 있으면 업데이트 없으면 생성함.
    @Test
    public void InsertDummies(){

        UserEntity userEntity = UserEntity.builder().
                id(1)
                .userId("abcd")
                .userPwd("1234")
                .userEmail("abcd@email.com")
                .userPhone("010-0000-0000")
                .build();

        userRepository.save(userEntity);
    }

    //DB read test
    @Test
    public void GetDummies(){

        long id = 1;
        //Optional객체를 이용해 값이 있는지 없는지 미리 확인이 가능하다.
        Optional<UserEntity> result = userRepository.findById(id);

        System.out.println("=================");

        //내용이 존재하면 내용을 프린트함
        if(result.isPresent()){
            UserEntity userEntity = result.get();
            System.out.println(userEntity);
        }

    }

    //DB read test2
    @Test
    public void GetuserId(){

        String userId = "abcd";
        //Optional.ofNullable Optional객체로 포장해줌
        Optional<UserEntity> result = Optional.ofNullable(userRepository.findByUserId(userId));

        System.out.println("=================");

        //내용이 존재하면 내용을 프린트함
        if(result.isPresent()){
            UserEntity userEntity = result.get();
            System.out.println(userEntity);
        }

    }

    //DB delete test
    @Test
    public void DeleteDummies(){
        long id = 1;

        userRepository.deleteById(id);
    }
}
