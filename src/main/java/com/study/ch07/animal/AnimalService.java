package com.study.ch07.animal;

public class AnimalService {

    boolean emptyString(String str) {
        if(str == null){
            return true;
        }
        return str.isBlank();
    }

    void writeService(Animal animal) {
        AnimalRepository animalRepository = new AnimalRepository();
        System.out.println("서비스까지 정보 도달 ");

        animalRepository.saveAnimalDate(animal);

    }
}
