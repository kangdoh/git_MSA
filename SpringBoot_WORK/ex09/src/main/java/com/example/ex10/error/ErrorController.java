package com.example.ex10.error;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Set;

@ControllerAdvice
public class ErrorController {

    //BizException이 발생했을때
    @ExceptionHandler(BizException.class)
    public ResponseEntity<ErrorResponse> mException(BizException e){
        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(e.getErrorCode().getMessage())
                .httpStatus(e.getErrorCode().getHttpStatus())
                .localDateTime(LocalDateTime.now())
                .build();
        return ResponseEntity
                .status(errorResponse.getHttpStatus())
                .body(errorResponse);
    }

    // 검증실패 NotEmpty 등 발생 -> MethodArgumentNotValidException 처리
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> validityException(MethodArgumentNotValidException e){

//        System.out.println(e.getBody());
//        System.out.println(Arrays.toString(e.getDetailMessageArguments()));
//        e.getFieldErrors()
//                .stream()
//                .forEach( fieldError -> System.out.println(fieldError.getDefaultMessage()));

        ErrorResponse errorResponse = ErrorResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message( Arrays.toString( e.getDetailMessageArguments() ))
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);
    }


    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> constraintException(ConstraintViolationException e){

        String msg = e.getConstraintViolations()
                .stream()
                .map(constraintViolation -> constraintViolation.getMessage())
                .reduce("",((s, s2) -> s+s2));
//                .forEach(System.out::println);


//        String msg = (String) Arrays.stream(e.getMessage())
//                .reduce("".(s, s2) - > toString()+s2.toString());

        Set<ConstraintViolation<?>> set = e.getConstraintViolations();
        String test = "";
        for(ConstraintViolation<?> item : set){
            System.out.println(item);
            System.out.println(item.getMessage());
            test = item.getMessage();
        }
        System.out.println(test);


        ErrorResponse errorResponse = ErrorResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(msg)
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);
    }
}