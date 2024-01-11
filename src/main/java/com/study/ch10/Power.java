package com.study.ch10;

//추상클래스는 생성만 안될뿐 기본적으로 일반메소드다
//인테페이스는 기본적으로 전부 추상메소드로 되어있음

public interface Power {
//    boolean powerState; //변수선언 불가능
//    boolean powerState = false; //초기화는 가능, 상수(값을 바꿀수없는 값) 선언만 가능
    String ERROR_CODE = "-9999"; //상수 선언가능

    void setPowerOn(); //기본적으로 추상메소드
    void setPowerOff();

    //interface는 아무것도 안쓰면 추상메소드지만
    //default를 붙여 일반메소드로 쓸수 있다
    default void test() {

    }

}
