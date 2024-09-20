package com.example.ex09.Freeboard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository<엔티티, 식별자의 타입>
// spring data jpa 자체가 자동으로 스프링 컨텍스트에 저장된다
// @Component, @Bean 이 두개가 스프링 컨텍스트에 저장하기 위한 어노테이션
public interface FreeBoardRepository extends JpaRepository<FreeBoard, Long> {



}