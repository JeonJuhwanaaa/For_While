package com.study.ch09;

public class SmartPhone extends ElectronicDevice{ // extends 상속
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다");

    }

    @Override //<단축기>Ctrl+ O(영어) / @이로 시작하면 어노테이션
    void showDeviceState() { //오버라이딩(재정의)
        super.showDeviceState();
    }
}
