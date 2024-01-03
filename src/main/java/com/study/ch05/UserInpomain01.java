package com.study.ch05;

import java.util.Scanner;

public class UserInpomain01 {
    public static void main(String[] args) {
        /* <<강사님이 한것>>
        * 이름 : 전주환(문자)
        * 나이 : 30(숫자)
        * 연락처 : 0100000000(문자열)
        * 학년 : 3(숫자)
        * 주소 : 부산진구(문자)
        * */
        Scanner scan = new Scanner(System.in);

        String name = null; //★변수 선언은 위로 다 올리자★
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null;

        System.out.print("이름: ");
        name = scan.next();
        System.out.print("나이: ");
        age = scan.nextInt();
        System.out.print("연락처: ");
        phone = scan.next();
        System.out.print("학년: ");
        grade = scan.nextInt();
        System.out.print("주소: ");
        address = scan.next();

        System.out.println();
    }
}
