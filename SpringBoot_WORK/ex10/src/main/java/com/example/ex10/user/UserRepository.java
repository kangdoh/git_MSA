package com.example.ex10.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//UserRepository는 식별자 밖에 몰라
public interface UserRepository extends JpaRepository<User, Long> {

    // email은 식별자가 아니다.
    Optional<User> findByEmail(String email);






}