package com.example.ex07.error;

import lombok.Getter;

@Getter
public class BizException extends RuntimeException{

    private final ErrorCode errorCode;

    public BizException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}

/*
ErrorController -> 예외를 @핸들링(해결)한다.

ErrorCode -> 어떤메시지를 띄우는지
ErrorResponse -> 에러정보를 던져주기
BizException -> 내가 지정한 예외,

 */