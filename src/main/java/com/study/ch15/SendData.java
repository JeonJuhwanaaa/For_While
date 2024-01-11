package com.study.ch15;

import lombok.AllArgsConstructor;

//전체 생성자 생성
@AllArgsConstructor

//제네릭 <T> = type
//제네릭은 여러개 사용 가능
//제네릭으로 일반자료형 사용 불가
public class SendData <T>{

    private int code;

    //Object 를 쓰므로 Member를 써도, String을 써도 괜춘
    //업케스팅
    //다운케스팅을 할필요가 없을 땐 Object 사용 하면된다
    //
    private T data;

    public void send() {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }
}
