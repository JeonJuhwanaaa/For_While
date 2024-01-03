package com.study.ch05;

public class If02 {
    public static void main(String[] args) {
        /*
         * x가 양수 y가 양수 = 2사분면
         * x가 음수 y가 양수 = 1사분면
         * x가 음수 y가 음수 = 3사분면
         * x가 양수 y가 음수 = 4사분면
         * x 또는 y가 0이라면 오류
         * */

        int x = 0;
        int y = -4;

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