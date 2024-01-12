package com.study.ch21;

import lombok.Getter;
import java.util.Map;

@Getter

public class ResponseException extends RuntimeException {
    private Map<String, Object> errorMap;

    public ResponseException(String message, Map<String, Object> errorMap) {
        //부모객체 생성되면 RuntimeException도 같이 생성
        super(message);
        this.errorMap = errorMap;
    }

}
