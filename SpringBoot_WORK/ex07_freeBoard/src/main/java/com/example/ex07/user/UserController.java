package com.example.ex07.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController // url 맵하는 클래스야
@RequestMapping("user") // 주소줄에 user로 시작하는거야
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("select")
    public List<User> select(){
        return userRepository.findAll();
    }

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody UserReqDto userReqDto){

        userService.insert(userReqDto);

        return ResponseEntity.status(200).body("success insert");
    }

    @PutMapping("update")
    public ResponseEntity<String> update(@Valid @RequestBody UserReqDto userReqDto) {
        userReqDto.setWdate(LocalDateTime.now());
        System.out.println("실행");
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        userRepository.save(user);
        return ResponseEntity.status(200).body("success update");
    }

    @DeleteMapping("delete/{idx}")
    public String delete(@PathVariable Long idx){
        userRepository.deleteById(idx);
        System.out.println(idx);
        return "delete";
    }



}