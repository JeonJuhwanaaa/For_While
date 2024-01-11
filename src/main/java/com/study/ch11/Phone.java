package com.study.ch11;

public class Phone {

    static int autoCount = 0; //static은 새로운 인스턴스들과 값이 변하지않고 공유
    int serialNumber;
    Company company;

    public Phone(Company company) { //생성자
        autoCount++; //main클래스에 new 인스턴스가 생성될 때마다 1씩 증가
        this.serialNumber = 20240000;
        this.serialNumber += autoCount; //더하고 대입하기
        this.company = company; //외부에서 입력값 가져오기
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}
