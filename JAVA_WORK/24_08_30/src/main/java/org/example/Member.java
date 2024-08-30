package org.example;

import lombok.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {
    private int idx;
    private String name;
    private String email;
    private int age;
    private String password;
    private LocalDateTime regdate;
    private LocalDateTime mydate;



}