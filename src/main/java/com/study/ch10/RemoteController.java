package com.study.ch10;

public class RemoteController extends ElectronicDevice { //추상클래스를 상속받을경우 오버라이드(재정의)로 풀어줘야한다 그래야 생성가능

    @Override //Cntl+ i
    void setPowerState() {
        System.out.println("리모컨의 상태를 확인합니다.");

    }
}
