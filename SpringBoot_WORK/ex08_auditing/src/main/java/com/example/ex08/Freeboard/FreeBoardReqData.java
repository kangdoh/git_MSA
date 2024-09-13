package com.example.ex08.Freeboard;

import com.example.ex08.user.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class FreeBoardReqData {

    private Long idx;
    private String title;
    private String content;
    private User user;
    private LocalDateTime regDate;
    private LocalDateTime moDAte;
    private int view_count;
}
