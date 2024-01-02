package com.study.ch04;

public class Operation03 {

    public static void main(String[] args) {
        /*
        * <<연산자>>
        *
        * 산술연산자, 비교연산자, 논리연산자, 조건연산자(삼항연산자), 복합대입연산자
        * */

        /*
        * 논리 연산자
        * &&(곱) - AND // 모든 조건이 다 충족되어야 true
        * ||(합) - OR // 하나라도 충족되면 true
        * !(부정) - NOT
        *
        * true(1)
        * false(0)
        * treu && false => false
        * treu && true => true
        * treu || false => true
        * false || false => false
        * !false --> true // !(NOT)를 붙이면 반대
        * */

        System.out.println("논리연산자");
        System.out.println(505 % 5 == 0 && 505 % 50 != 0); // &&(AND) 는 모든 조건이 충족되어야 true
        System.out.println(505 % 5 == 0 || 505 % 50 != 0); // ||(OR) 는 하나라도 조건이 충족되면 true
        System.out.println(!(505 % 5 == 0 || 505 % 50 != 0)); // 맨앞에 ! 붙이면 반대의 결과 출력

        int age = 30;
        System.out.println(age < 40 && age > 20 && age != 30); //항상 비교대상이 앞으로

    }
}
