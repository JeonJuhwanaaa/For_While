package com.study.ch08.car;

public class Car {
    String model;
    String color;

    //생성자
    //NoArgsConstructor
    Car() {

    }

    //AllArgsConstructor
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
