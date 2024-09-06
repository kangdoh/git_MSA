package com.pmh.ex03.user;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/*
*   @Configuraion -> 객체 담는통 정의
*   @Bean -> 그거 객체야
*   @Component -> 객체
*   @ComponentScan -> 패키지 내용 읽어서 객체 주입해줘
*   @Autowride -> new 예약어 안쓰고 객체 자동 할당...
*   private finall ->
*
*   @Entity -> 이게 테이블이다.
*   @Table -> table이름 바꾸기
*   @Id -> 기본키다(primary키)
*/


@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String name;
    private int age;
    private String email;
    private String password;

    //JPA CLASS -> table CREATE가 됩니다.


}