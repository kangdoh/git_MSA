package com.example.ex07.Freeboard;

import com.example.ex07.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class freeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String title;
    private String content;

    // 한명의 유저가 여러개의 게시물 (OneToMany도 있다 주의!)
    @ManyToOne
//            (cascade = GenerationType.class)
    private User user;

    private LocalDateTime regDate;
    private LocalDateTime moDAte;

    private int view_count;


}
