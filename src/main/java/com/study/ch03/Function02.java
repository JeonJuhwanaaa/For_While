package com.study.ch03;

public class Function02 {                              //클래스

    //매개변수x, 리턴x
    public static void  fx01() {
        //void -> 비어있는, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();

    }

    //함수의 오버로딩: 함수명이 같더라도 매개변수의 자료형이 다르면 함수정의가 가능하다
    public static void fx02(String name, int age) { //★매개변수가 중요하고★ 자료형과 변수는 상관x
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println();

    }

    public static int fx03() { //리턴 자료형이 void 값이아닌 int 값
        System.out.println("fx03 함수 실행");
        return 100;
    }

    public static String fx04(String name, int age) { // 리턴 자료형이 void 값이 아닌 String 값
        return name + ", " + age;
    }

    public static void main(String[] args) {            //메인
        fx01();
        fx02(30, "전주환"); //fx02()안에 age, name 넣었기에 꼭 순서에 맞춰서 값 넣어주기
        fx02("전주환", 30);

        int num = fx03(); //int값을 리턴
        System.out.println(fx03());

        String result = fx04("전주환", 30); //String 값을 리턴
        System.out.println(result);
    }
}
