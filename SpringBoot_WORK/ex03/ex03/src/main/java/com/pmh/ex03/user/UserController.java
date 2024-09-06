package com.pmh.ex03.user;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("user")
@AllArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select(){
        return userRepository.findAll();
    }

    @PostMapping("insert")
    public String insert(@RequestBody User user){
        System.out.println("실행");

//        User user = User.builder()
//                .name("홍길동")
//                .age(20)
//                .email("Afasdfa@nafer.com")
//                .password("dfasdf")
//                .build();
        // save insert 실행...

        userRepository.save(user);
        return "ok";
    }




}