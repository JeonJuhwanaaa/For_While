package com.study.ch07.animal;

public class AnimalDB {

    void writeData(Animal animal) {
        System.out.println("동물보감 입력완료");
        System.out.println("입력된 정보");
        System.out.println("동물 종: " + animal.specise);
        System.out.println("동물 색: " + animal.color);
        System.out.println("동물 수명: " + animal.year);
        System.out.println();
    }
}
