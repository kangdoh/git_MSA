package com.example.ex09.Freeboard;

import com.example.ex09.user.User;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class FreeBoardResponseDto {

    private Long idx;
    private String title;
    private String content;
    private User user;
    private String regDate;
    private String modDate;
    private int view_count;

}