package com.study.ch07.animal;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {

        AnimalService animalService = new AnimalService();

        Scanner scanner = new Scanner(System.in);
        String animalSpecise = null;
        String animalColor = null;
        int animalYear = 0;

        System.out.println("동물보감 등록 프로그램");

        System.out.print("동물 종: ");
        animalSpecise = scanner.next();
        if(animalService.emptyString(animalSpecise)){
            System.out.println("종을 다시 입력하시오.");
            return;
        }

        System.out.print("동물 색: ");
        animalColor = scanner.next();
        if(animalService.emptyString(animalColor)){
            System.out.println("색을 다시 입력하시오.");
            return;
        }

        System.out.print("동물 수명: ");
        animalYear = scanner.nextInt();

        Animal animal = new Animal(animalSpecise, animalColor, animalYear);
        animalService.writeService(animal);

    }
}