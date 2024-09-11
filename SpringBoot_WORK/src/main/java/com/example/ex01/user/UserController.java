package com.example.ex01.user;

import com.example.ex01.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;


@RestController
@CrossOrigin
public class UserController {

    // spring 객체 담는 통에서 자동으로 가져오기
    @Autowired
    MemberRepository memberRepository;

    @GetMapping("fasdfasdf")
    public String aa(@RequestParam(name="name", defaultValue = "내이름") String name,
                     @RequestParam(name="age", defaultValue = "나이") Integer age){

        System.out.println("name +"+name);
        System.out.println("age +"+age);

//        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insert(name, age);
        return "저장했습니다.";
    }




}