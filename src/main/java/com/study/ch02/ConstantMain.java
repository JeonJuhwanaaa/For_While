package com.study.ch02;

public class ConstantMain {
    public static void main(String[] args) {
        // 상수(변하지않는 값) = 대문자로만 표기한다(2단어 이상 일때 _ 사용),최초 한번만 대입이 가능하다,무조건 초기화가 되어야한다
        final String FILE_PATH = "c:/aws/project"; //자료형 앞에 final 을 붙임으로써 값이 상수가 된다,어떠한 값이라도 들어가있어야 한다
    }
}
