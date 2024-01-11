package com.study.ch08.car;

public class CarService {

    CarRepository carRepository; //변수

    CarService(CarRepository carRepository) { //생성자
        this.carRepository = carRepository;
    }

    boolean isFull() {
        return carRepository.getEmptyIndex() == -1; //비었다 안비었다를 구분 , -1은 비었다는 뜻
    }

    void append(Car car) {
        carRepository.insert(car);

    }

    void printCarList() {
        Car[] cars = carRepository.getCarDatas();
        if (cars.length == 0){
            System.out.println("등록된 차량이 없습니다");
            return;
        }
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i].toString());
        }
    }

}
