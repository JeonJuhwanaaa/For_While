package com.study.ch02;

public class PersonMain {

    public static void main(String[] args) {
        Person p = new Person(); //person 이라는 새로운 데이터공간을 만듦
        p.name = "전주환"; // . 은 p로 들어간다는 뜻
        p.age = 29;

        Person p2 = new Person(); //또 다른 person 주소를 만듦
        p2.name = "전주한";
        p2.age = 29;

        /*
        * 이름, 학년, 주소를 저장할 수 있는 StudentType 클래스를 만드시오.
        * */

    }
}
