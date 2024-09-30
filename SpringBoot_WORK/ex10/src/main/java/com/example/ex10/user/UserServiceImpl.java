package com.example.ex10.user;

import com.example.ex10.error.BizException;
import com.example.ex10.error.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {

    private final UserRepository userRepository;

    //email 중복이면 에러코드
    //email 중복이 아니면 insert 정상적으로 입력.
    public void insert(UserReqDto userReqDto){

        Optional<User> optionalUser = userRepository.findByEmail(userReqDto.getEmail());
        optionalUser.ifPresent(user ->{
                throw new BizException(ErrorCode.DUPLICATE_USERS);}
//                System.out.println("EMAIL중복")
        );

        userReqDto.setWdate(LocalDateTime.now());
        System.out.println("실행");
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);
        userRepository.save(user);
    }

//    User dbUser = userRepository.findById(
//            user.getIdx()).orElseThrow();




}