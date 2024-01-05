package com.study.ch06;

import java.util.Scanner;

public class For03_2 {
    public static void main(String[] args) {

        /*
        *
        * *****
        * ****
        * **
        * *
        *
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("별 몇개?");
        int count = scan.nextInt();

        for(int i =0; i < count; i++) {
            for (int j = 0; j < count -i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
