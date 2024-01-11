package com.study.ch10;

public class ElectronicDeviceMain {

    public static void main(String[] args) {

        new RemoteController();

        // 추상 클래스(abstract class)가 불완전(정의가 안돼서) xx, 추상클래스가 구현하면 oo
        // 추상클래스는 상속을 받아야 생성가능
        // 익명클래스- 일회용(필요한곳 한곳에 쓰기위한 용도)
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override
            void setPowerState() {
                System.out.println("첫번째 기기 상태확인");
            }
        };

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void setPowerState() {
                System.out.println("두번째 기기 상태확인");
            }
        };


        RemoteController remoteController = new RemoteController(); //상속이돼서 class로 정의가 되면 가능

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController;

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

    }
}
