package com.example.spring_study.loginStudy.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_userInfo")
public class UserEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 30)
    private String userId;

    @Column(nullable = false, length = 30)
    private String userPwd;

    @Column(nullable = true, length = 30)
    private String userEmail;

    @Column(nullable = true, length = 30)
    private String userPhone;
}
