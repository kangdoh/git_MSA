package com.example.ex08.Freeboard;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("freeBoard")
@RequiredArgsConstructor
@CrossOrigin
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

    @GetMapping
    public ResponseEntity<List<freeBoard>> findALL() {
        List<freeBoard> list = freeBoardRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<freeBoard> save(@RequestBody FreeBoardReqData freeBoardReqData) {
        freeBoard freeboard = new ModelMapper().map(freeBoardReqData, freeBoard.class);

        freeBoardRepository.save(freeboard);

        return ResponseEntity.status(200).body(freeboard);
    }

}