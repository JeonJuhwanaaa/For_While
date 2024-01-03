package com.study.ch04;

public class Operation09 {

    public static void main(String[] args) {
        /*
        *
        * <<증감연산자>>
        *
        *  i++ //1씩 증가/ 후 증가연산 ★대부분 후 증/감 사용★
        *  ++i //선 증가연산
        *  i--
        *  --i
        * */

        int i = 0;
        System.out.println(i++); //다음 i부터 증가한다(후 증가)
        System.out.println(i);
        System.out.println(i--); //다음 i부터 감소한다(후 감소)
        System.out.println(i);


    }
}