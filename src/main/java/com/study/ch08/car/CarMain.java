package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

        Car[] cars = new Car[3]; //등록한 정보를 여기에 대입(저장)
        CarRepository carRepository = new CarRepository(cars);
        CarService carService = new CarService(carRepository);


        while (loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();
            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료중...");
                loopFlag = false;

            } else if ("1".equals(selectedMenu)) {
                System.out.println("<<< 자동차 등록 페이지 >>>");

                String model = null;
                String color = null;

                if (carService.isFull()) { //저장 빈 공간이 없다면
                    System.out.println("더이상 등록할 수 없습니다");
                    continue; //break 걸면 while문이 종료되기때문에 coutinue(띄어넘기)문으로 한다
                }

                System.out.print("모뎅 명 >>> ");
                model = scanner.nextLine();
                System.out.print("색상 >>> ");
                color = scanner.nextLine();

                Car car = new Car(model, color); // entity(정보를 담는)
                carService.append(car);

            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<< 자동차 조회 페이지 >>>");
                carService.printCarList();

//                for(int i = 0; i < cars.length; i++) {
//                    System.out.print("[" + i + "]");
//                    if (cars[i] == null) {
//                        System.out.println("등록된 정보가 없습니다");
//                        continue; //null인 경우 띄어넘기(continue)
//                    }
//                    System.out.println(cars[i].toString()); //null인 경우 출력이 안된다
//                }

            }else{
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }

}
