package com.example.ex09.Freeboard;

import com.example.ex09.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class FreeBoard {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String title;
    private String content;

    // 한명의 유저가 여러개의 게시물 (OneToMany도 있다 주의!)
    @ManyToOne
    // (cascade = GenerationType.class)
    private User user;

    @CreatedBy
    private String creaAauthor;
    @LastModifiedBy
    private String modAauthor;


    @CreatedDate
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modate;

    @Column(columnDefinition = "int default 0")
    private int view_count;


}
