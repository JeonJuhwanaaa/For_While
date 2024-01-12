package com.study.ch19;

import lombok.ToString;

@ToString
public class Student {
    //1번
    private String name;
    private String address;
    private int age;

    //5번 -AllArgsConstructor
    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    //3번
    public static Studentbuilder builder(){
        return new Studentbuilder();
    }
    //2번
    public static class Studentbuilder{
        private String name;
        private String address;
        private int age;

        //6번
        public Student builder() {
            return new Student(name, address, age);
        }
        //4번 - setter
        public Studentbuilder name(String name){
            this.name = name;
            //자기자신의 주소를 리턴하면서 데이터 쌓기
            return this;
        }
        public Studentbuilder address(String address){
            this.address = address;
            return this;
        }
        public Studentbuilder age(int age){
            this.age = age;
            return this;
        }
    }
}