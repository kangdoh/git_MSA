package com.example.ex10.Freeboard;

import com.example.ex10.user.User;
import lombok.Data;

// response DTO : 프론트에게 응답해주기 위한 클래스
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