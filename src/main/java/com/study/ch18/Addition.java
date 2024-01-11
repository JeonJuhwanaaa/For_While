package com.study.ch18;

//람다식을 위한 함수형인터페이스
//람다식은 추상메소드가 반드시 1개
@FunctionalInterface
public interface Addition {
    //인터페이스는 기본적으로 추상메소드이다
    public int add(int x, int y);
}
