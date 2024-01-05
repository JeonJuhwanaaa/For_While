package com.study.ch06;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {

        /*
         *
         *     *
         *    ***
         *   *****
         *  *******
         *
         * */

        Scanner scan = new Scanner(System.in);
        System.out.println("별 몇개?");
        int count = scan.nextInt();

        for(int a = 0; a < count; a++) {
            for (int i = 0; i < count -a-1; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*a+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
