package com.example.ex10.file;

import com.example.ex10.Freeboard.FreeBoard;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "freeBoardFile")
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String name;
    private String path;
    private String fileDesc;

    @ManyToOne
//    @JoinColumn(name = "free_board_idx")
    @JsonIgnore
    private FreeBoard freeBoard;

    @Override
    public String toString() {
        return "FileEntity{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", fileDesc='" + fileDesc +
                '}';
    }
}