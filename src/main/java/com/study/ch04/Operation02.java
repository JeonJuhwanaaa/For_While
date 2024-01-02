package com.study.ch04;

public class Operation02 {

    public static void main(String[] args) {
        /*
        * <<연산자>>
        *
        * 산술연산자, 비교연산자, 논리연산자, 조건연산자(삼항연산자), 복합대입연산자
        * */

        System.out.println(true);
        System.out.println(false);

        boolean flag = 10 > 2; // boolean = 참,거짓을 결과로

        System.out.println("비교연산자");
        System.out.println(" > " + flag); // 결과로 참(ture),거짓(false)이 나온다
        System.out.println(" < " + (10 < 2));
        System.out.println(" >= " + (10 >= 2));
        System.out.println(" <= " +  (10 <= 2));
        System.out.println(" == " + (10 == 2)); // == 같다
        System.out.println(" != " + (10 != 2)); // != 같지 않다
    }
}
