package com.study.ch06;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {

        /*
         *
         * *****
         *  ****
         *   ***
         *     *
         *
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("별 몇개?");
        int count = scan.nextInt();

        for(int a = 0; a < count; a++) {
            for (int i = 0; i < a; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count - a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
