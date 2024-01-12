package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
//        <<Builder 패턴>>
//        Car car = new Car("Benz", "black");
//        builder 은 static 로 객체생성
//        Car car = Car.builder()
//                .model()
        //        new Car로 생성돼서 car에 대입하는 경로
        //        Car.CarBuilder carBuilder = new Car.CarBuilder(); 랑 같은 것
//                .color("black")
//                .build();
//
//        System.out.println(car);
        Car.CarBuilder carBuilder = Car.builder();
        Car car2 = carBuilder.build();

        Car car = Car.builder().model("benz").color("black").build();

        System.out.println(car);

        //--------------------------------------------------------------

        Student.Studentbuilder studentbuilder = Student.builder();
        Student student = studentbuilder.builder();

        Student student1 = Student.builder()
                .name("전주환")
                .address("부산진구")
                .age(30)
                .builder();

        System.out.println(student1);

        //--------------------------------------------------------------

        Member member = Member.builder()
                .name("길동")
                .phone("01000000000")
                .build();
        Member member2 = new Member("김주닐", "01000000000");
        System.out.println(member);

    }
}
