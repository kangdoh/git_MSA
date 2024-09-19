package com.example.ex09.Freeboard;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

        Sort sort = Sort.by(Sort.Direction.DESC, "idx");
        int page = 0;
        int size = 5;

        Pageable pageable = PageRequest.of(page,size,sort);
        Page<freeBoard> list = (Page<freeBoard>) freeBoardRepository.findAll(pageable);
        return ResponseEntity.ok(list.get().toList());
    }


    // @Valid 가 있어야 유효성 검사 가능?
    @PostMapping
    public ResponseEntity<freeBoard> save(@Valid @RequestBody FreeBoardReqData freeBoardReqData) {
        freeBoard freeboard = new ModelMapper().map(freeBoardReqData, freeBoard.class);

        freeBoardRepository.save(freeboard);
        return ResponseEntity.status(200).body(freeboard);
    }

}