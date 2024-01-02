package com.study.ch04;

public class Operation04 {

    public static void main(String[] args) {
        /*
        * <<문제>>
        * 연도가 주어졌을 때, 윤년이면 true, 아니면 false 을 출력하는 프로그램을 작성하시오.
        *
        * - 윤년은 연도가 4의 배수이면서(&&), 100의 배수가 아닐 때 또는(||) 400의 배수일 때이다.-
        *
        * 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
        * 1900년은 100의 배수이고 400은 배수는 아니기 때문에 윤년이 아니다.
        * 하지만 2000년은 400의 배수이기 때문에 윤년이다.
        *
        *  - 연도는 0보다 크고, 4001보다 작은 자연수이다. -
        *
        * int year = 2000; -> 결과 true
        * int year = 1999; -> 결과 false
        * */

        int y = 1999;

        boolean step1 = y > 0;
        boolean step2 = y < 4001;
        boolean step3 = y % 4 == 0; //4의 배수 - 4로 나눴을 때 나머지가 0이다.
        boolean step4 = y % 100 != 0; //100으로 나눴을 때 나머지가 0이면 안된다
        boolean step5 = y % 400 == 0; //400의 배수

        boolean result = step1 && step2 && (step3 && step4 || step5);
        System.out.println("결과 : " + result);

    }
}
