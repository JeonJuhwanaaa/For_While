package com.study.ch08.car;

public class CarRepository { // 저장소에는 배열을
    final Car[] cars; //final이 들어감으로써 이 값은 무조건 필수다

    CarRepository(Car[] cars) {
        this.cars = cars;
    }

    int getEmptyCount() {
        int emptyCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                emptyCount++;
            }
        }
        return emptyCount;
    }

    int getEmptyIndex() {
        for(int i = 0; i < cars.length; i++){
            if(cars[i] == null) {
                return i;
            }
        }
        return -1; // 빈공간이 없다는 것
    }

    void insert(Car car) {
        cars[getEmptyIndex()] = car;

    }

    Car[] getCarDatas() {
        int carCount = 0;
        for(int i=0; i < cars.length; i++){
            if(cars[i] != null){
                carCount++;
            }
        }
        Car[] newCars = new Car[carCount];
        int j = 0;
        for(int i = 0; i < cars.length; i++){
            if(cars[i] != null){
                newCars[j] = cars[i];
                j++;
            }
        }

        return newCars;
    }

}
