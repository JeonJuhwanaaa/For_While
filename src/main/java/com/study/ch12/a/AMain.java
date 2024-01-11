package com.study.ch12.a;

public class AMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("전주환"); //setter
        System.out.println(student.getName());//getter

        student.setAddress("부산진구");
        System.out.println(student.getAddress());

        System.out.println(student.toString());


    }
}
