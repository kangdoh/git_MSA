package com.example.ex07.error;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    // ctrl + shift + x 번역 단축키
    // DUPLICATE_USERS : enum에서만 사용하는 / 이미 로딩이 되어있어서 객체타입.DUPLCATE~(상수)
    DUPLICATE_USERS(HttpStatus.BAD_REQUEST,"EMAIL 중복입니다."),
    ;

    private HttpStatus httpStatus;
    private String message;

    ErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }
}