package com.study.ch10;

//interface는 이 클래스에 적용시킬려면 implements 사용
//인터페이스도 재정의 필수
//인터페이스는 ,(쉼표)로 다중 상속 가능, 일반적으론 하나만 상속가능

public class Laptop implements Power {

    @Override
    public void setPowerOn() {

    }

    @Override
    public void setPowerOff() {

    }

}
