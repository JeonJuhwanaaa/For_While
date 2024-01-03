package com.study.ch05;

import java.util.Scanner;

public class UserInpomain {
    public static void main(String[] args) {
        /* <<내가한것>>
        * 이름 : 전주환(문자)
        * 나이 : 30(숫자)
        * 연락처 : 0100000000(문자열)
        * 학년 : 3(숫자)
        * 주소 : 부산진구(문자)
        * */
        Scanner scan = new Scanner(System.in);

        System.out.print("이름: ");
        String str1 = scan.next();
        System.out.print("나이: ");
        int i1 = scan.nextInt();
        System.out.print("연락처: ");
        String str2 = scan.next();
        System.out.print("학년: ");
        int i2 = scan.nextInt();
        System.out.print("주소: ");
        String str3 = scan.next();

        System.out.println();
        System.out.println("*이름: " + str1 + "\n" + "*나이: " + i1 + "\n" + "*연락처: " + str2 + "\n" + "*학년: " + i2 + "\n" +"*주소: " +str3);


    }
}
