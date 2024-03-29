package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {

        // new 붙으면 동적메모리 할당
        Computer computer1 = new Computer(); //인스턴스를 생성 = 메모리를 할당한다
        Computer computer2 = new Computer("노트북");

        System.out.println(computer1);
        System.out.println(computer2);

        computer1.cpu = "i5";
        computer2.cpu = "i7";

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);
        computer1.showInfo();
        computer2.showInfo();

        computer1.ram = "8GB";
        computer2.ram = "16GB";

        computer1.showInfo();
        computer2.showInfo();

        computer1.type = "데스크탑";

    }
}