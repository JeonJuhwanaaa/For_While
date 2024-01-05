package com.study.ch07;

public class Student01 {

    String name;
    int age;
//    String address;
    final String address; // final 필수

    //<< 생성자 constructor>>
    //args(arguments) 매개변수 값

    //NoArgsConstructor
/*    Student01() {

    }*/

    //생성자 오버로딩
    //AllArgsConstructor
    Student01(String name,int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //RequiredArgsConstructor (필수)
    Student01(String address){
        this.address = address;
    }
}
