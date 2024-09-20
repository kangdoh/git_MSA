package com.example.ex09.Freeboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardResponsePageDto {

    @Schema(hidden = true) //swagger문에서 안보이게
    @JsonIgnore //postman에서 안보이게
    private List<FreeBoard> content;
    private List<FreeBoardResponseDto> list;
    private int totalElements;
    private int totalPages;
    private int size;

}