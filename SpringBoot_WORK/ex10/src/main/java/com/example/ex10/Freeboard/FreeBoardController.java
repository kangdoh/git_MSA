package com.example.ex10.Freeboard;

import com.example.ex10.error.BizException;
import com.example.ex10.error.ErrorCode;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("freeBoard") // http://localhost:8080/freeBoard
@Slf4j // log.info 사용
@RequiredArgsConstructor // 생성자 자동 생성(lombok), @Bean 도 해결
@CrossOrigin
public class FreeBoardController {
    /**
     *
     * public class Person {
     *  private String name; // 멤버 변수 , 멤버 필드
     *  private String age;
     *
     *  // 생성자
     *  public Person(String name, String age) {
     *      this.name = name;
     *      this.age = age;
     *  }
     *
     *
     * }
     */
    private final FreeBoardRepository freeBoardRepository;
    private final ModelMapper modelMapper;

    // 생성자 주입 : 필요할 때 스프링 컨텍스트에 있는 빈을 가져와서 주입한다
//    public FreeBoardController(FreeBoardRepository freeBoardRepository) {
//        this.freeBoardRepository = freeBoardRepository;
//    }

    @Value("${my.value}")
    private String welcome;

    @GetMapping("test")
    public String test(){
        return welcome;
    }


    @GetMapping
    // /freeBoard?pageNum=0&size=5
    public ResponseEntity<FreeBoardResponsePageDto> findALl(
            @RequestParam(name = "pageNum", defaultValue = "0") int pageNum
            , @RequestParam(name = "size", defaultValue = "5") int size) {
        // select * from freeboard oder by idx desc, name desc,
        Sort sort = Sort.by(Sort.Direction.DESC, "idx");

        // 총 데이터 개수 구해서 몇개로 나누고 .... 로직짜야됐는데 Pageable란 인터페이스가 자동으로 지원해준다 (JPA)
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


    // id를 받아서 그 아이디의 정보를 찾아오는 상황
    // /freeBoard/view/1
    @GetMapping("view/{idx}") // 예시) /freeBoard/view/1
    public ResponseEntity<FreeBoardResponsePageDto> findOne(@PathVariable(name = "idx") long idx){
//        log.info("idx = {}", idx);
        
        FreeBoard freeBoard = freeBoardRepository.findById(idx)
                .orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));

        new ModelMapper().map(freeBoard, FreeBoardResponseDto.class);

        return null;
    };


    // 데이터를 받아오는 상황(저장)
    @PostMapping
    public ResponseEntity<FreeBoard> save(@Valid @RequestBody FreeBoardReqDto freeBoardReqDto) {
        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);

//        FreeBoard freeBoard1 = new FreeBoard();
//        freeBoard1.setIdx(freeBoardReqDto.getIdx());
//        freeBoard1.setTitle(freeBoardReqDto.getTitle());
//        freeBoard1.setContent(freeBoardReqDto.getContent());

        freeBoardRepository.save(freeBoard);
        return ResponseEntity.status(200).body(freeBoard);
    }


    @DeleteMapping("delete/{idx}")
    public ResponseEntity<String> deleteById(@PathVariable(name="idx") long idx){
        freeBoardRepository.findById(idx).orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));
        freeBoardRepository.deleteById(idx);
        return ResponseEntity.status(200).build();
    }





}