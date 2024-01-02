package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {

        StudentType s = new StudentType();
        s.name = "전주환";
        s.studentYeal = 1;
        s.address = "부산진구";

        System.out.println("이름 : " + s.name + "\t" +"학년 : " + s.studentYeal + "\t" +"주소 : " + s.address);

        Person p = s; //업캐스트
        StudentType s2 = (StudentType) p; //다운캐스트라서 형변환

//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;

        StudentType 전주환학생 = new StudentType(); // 상위개념 하위개념 이해하기
        Person 전주환사람 = 전주환학생; //p > s , p가 상위니깐 가능
        StudentType 전주환학생2 = (StudentType) 전주환사람; //s가 하위니깐 형변화 해줘야 가능

    }
}
