package com.study.ch02;

public class Variable {

    public static void main(String[] args) {
        int date = 20231229;
        // = 대입하는 부호
        //int data; --- 선언
        //date = 10 --- 대입

        double date2 = date;
        int date3 = (int) date2; // (int) 가 형변환 해준것
        //실수는 정수 포함, 정수는 실수 비포함
        // 즉, double(실수)이 상위개념(업캐스팅) , 업케스팅은 형변환 안해줘도 된다 다운캐스팅은 형변환 해줘야 됨
        // 문자 -> 정수 -> 실수 (문자가 제일 하위개념)

        char a = '1';
        int b = a;
        double c = b; //업캐스팅 한것

        System.out.println(date+1);
        System.out.println(date+2);
        System.out.println(date+3);
        System.out.println(date+4);
        System.out.println(date+5);
        System.out.println(date+6);
        System.out.println(date+7);
        System.out.println(date+8);
        System.out.println(date+9);
    }
}
