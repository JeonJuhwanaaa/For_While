package com.study.ch09;

public class Computer extends ElectronicDevice { //상속

    String cpu;
    int ram;

    void palyGame() {
        System.out.println("PC 게임을 합니다");
    }

    void showDeviceState() { //★★★★오버라이딩 (재정의): 부모의 메소드와 동일한 메소드의 형태로 실행문만 다시 정의 할수있다.
        System.out.print("컴퓨터");
        super.showDeviceState();
    }
}
