package com.study.ch06;

import java.util.Scanner;

public class For04_2 {
    public static void main(String[] args) {

        /*
         *
         *     *
         *    **
         *   ***
         *  ****
         *
         * */

        Scanner scan = new Scanner(System.in);
        System.out.println("별 몇개?");
        int count = scan.nextInt();

        for(int n =0; n < count; n++) {
            for (int i = 0; i < count-n-1; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
