package com.study.ch05;

import java.util.Scanner;

public class UserInpomain02 {
    public static void main(String[] args) {
        /*
         * <<x랑 y 입력프로그램 만들기>>
         *
         * x가 양수 y가 양수 = 2사분면
         * x가 음수 y가 양수 = 1사분면
         * x가 음수 y가 음수 = 3사분면
         * x가 양수 y가 음수 = 4사분면
         * x 또는 y가 0이라면 오류
         *
         * */

        Scanner scan = new Scanner(System.in);

        int x = 0; //되도록이면 변수 선언을 맨위로 정렬
        int y = 0;

        System.out.print("x값: ");
        x = scan.nextInt();
        System.out.print("y값: ");
        y = scan.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("오류");
        } else if (x > 0 && y > 0) {
            System.out.println("2사분면");
        } else if (x > 0 && y < 0) {
            System.out.println("4사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("1사분면");
        } else {
            System.out.println("3사분면");
        }

    }
}
