package com.study.ch07.animal;

public class AnimalRepository {

    void saveAnimalDate(Animal animal){
        AnimalDB animalDB = new AnimalDB();
        animalDB.writeData(animal);

    }
}
