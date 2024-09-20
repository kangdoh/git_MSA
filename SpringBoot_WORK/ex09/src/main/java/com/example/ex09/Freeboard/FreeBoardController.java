package com.example.ex09.Freeboard;

import com.example.ex09.Freeboard.FreeBoard;
import com.example.ex09.Freeboard.FreeBoardRepository;
import com.example.ex09.Freeboard.FreeBoardResponseDto;
import com.example.ex09.Freeboard.FreeBoardResponsePageDto;
import com.example.ex09.error.BizException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@Slf4j // log.info 사용
@CrossOrigin //
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

    @GetMapping
    public ResponseEntity<FreeBoardResponsePageDto> findALl(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum
            , @RequestParam(name = "size", defaultValue = "5") int size) {
        // select * from freeboard oder by idx desc, name desc,
        Sort sort = Sort.by(Sort.Direction.DESC, "idx");

        Pageable pageable = PageRequest.of(pageNum, size, sort);

        // Page List
        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);

        System.out.println("elements = " + page.getTotalElements());
        System.out.println("pages = " + page.getTotalPages());

        FreeBoardResponsePageDto freeBoardResponsePageDto
                = new ModelMapper()
                .map(page, FreeBoardResponsePageDto.class);

        List<FreeBoardResponseDto> list = new ArrayList<>();

        for (FreeBoard freeBoard : freeBoardResponsePageDto.getContent()) {
            FreeBoardResponseDto freeBoardResponseDto
                    = new ModelMapper().map(freeBoard, FreeBoardResponseDto.class);

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");

            freeBoardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
            freeBoardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModate()));
            list.add(freeBoardResponseDto);
        }

        freeBoardResponsePageDto.setList(list);
        return ResponseEntity.ok(freeBoardResponsePageDto);
    }


    @GetMapping("view/{idx}")
    public ResponseEntity<FreeBoardResponsePageDto> findOne(@PathVariable long idx){
//        log.info("idx = {}", idx);

        return null;
    };


    @PostMapping
    public ResponseEntity<FreeBoard> save(@Valid @RequestBody FreeBoardResponseDto freeBoardReqDto) {
        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);
        freeBoardRepository.save(freeBoard);
        return ResponseEntity.status(200).body(freeBoard);
    }


    @DeleteMapping("delet/{idx}")
    public ResponseEntity<String> deleteById(@PathVariable(name="idx") long idx){
        freeBoardRepository.findById(idx).orElseThrow() -> new BizException((ErrorCode.NOT_FOUND));
        freeBoardRepository.deleteById(idx);
//        return ResponseEntity0;
    }






}