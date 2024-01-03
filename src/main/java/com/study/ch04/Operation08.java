package com.study.ch04;

public class Operation08 {

    public static void main(String[] args) {
        /*
        *
        * <<문제>>
        *
        * 복합대입연산(산술연산, 대입연산)
        *
        * */

        int num1 = 10;
        int num2 = 20;
        num1 = num1 + num2; //뒤에서부터 계산, 자기자신한테 어떠한 값을 대입
        num1 += num2; //자기자신한테 num2값을 더해서 대입해라
        num1 *= num2; //자기자신한테 num2값을 곱해서 대입해라

        System.out.println(num1);


    }
}