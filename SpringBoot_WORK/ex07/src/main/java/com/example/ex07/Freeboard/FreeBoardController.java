package com.example.ex07.Freeboard;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("freeBoard")
@RequiredArgsConstructor
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

    @GetMapping
    public ResponseEntity<List<freeBoard>> findALL(){
        List<freeBoard> list = freeBoardRepository.findAll();
        return ResponseEntity.ok(list);
    }


}