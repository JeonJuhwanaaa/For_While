package com.study.ch04;

public class Operation05 {

    public static void main(String[] args) {
        /*
        * <<문제>>
        *
        * int x = 0;
        * int y = 1;
        *
        * 1. x와 y 중 하나라도 값이 0이면 결과는 "오류"
        * 2. x가 양수이면서 y가 양수 -> "1사분면"
        * 2. x가 음수이면서 y가 양수 -> "2사분면"
        * 2. x가 음수이면서 y가 음수 -> "3사분면"
        * 2. x가 양수이면서 y가 음수 -> "4사분면"
        * */

        int x = -1;
        int y = -2;

        String result = x == 0 || y == 0 ? "오류"
                : (x > 0 ? (y > 0 ? "1사분면" : "4사분면")
                : (y > 0 ? "2사분면" : "3사분면"));

        System.out.println(result);

        String result2 = x > 0 && y > 0 ? "1사분면"
                : x > 0 && y < 0 ? "4사분면"
                : x < 0 && y > 0 ? "2사분면"
                : x < 0 && y < 0 ? "3사분면" : "오류";

        System.out.println(result2);




    }
}