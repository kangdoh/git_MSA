package com.example.ex04.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController // url 맵하는 클래스야
@RequestMapping("user") // 주소줄에 user로 시작하는거야
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select(){
        return userRepository.findAll();
    }

    @PostMapping("insert")
    public String insert(@Valid @RequestBody UserReqDto userReqDto){
        userReqDto.setWdate(LocalDateTime.now());
        System.out.println("실행");

        // save insert 실행...
//        User user = User.builder()
//                .name("홍길동")
//                .age(20)
//                .email("aaa@naver.com")
//                .password("password")

//                .wdate(LocalDateTime.now())
//                .build();

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        userRepository.save(user);
        return "ok";
    }

    @DeleteMapping("delete/{idx}")
    public String delete(@PathVariable Long idx){
        userRepository.deleteById(idx);
        System.out.println(idx);
        return "delete";
    }


}