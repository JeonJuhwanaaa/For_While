package com.study.ch10;

/*
*      [추상화](공통점을 뽑아낸다)
*    1.추상 클래스 abstract
*    2.인테페이스 interface
*
*
* */

public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;

    }
    void showDeviceState() { //매번 재정의할거면 필요가 없다
        System.out.println("전원 상태: " + ((powerState) ? "켜짐" : "꺼짐"));
    }

    //추상메소드 - 인테페이스랑 추상클래스 에만 가능
    abstract void setPowerState();


}
