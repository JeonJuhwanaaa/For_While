package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.in -> 입력도구

        System.out.print("타이틀 : ");
        String title = scanner.nextLine(); //nextLine 은 띄어쓰기 포함 값 출력

        System.out.print("a: ");
        int a = scanner.nextInt();//한줄 당 입력 개수 1
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();


        System.out.println(title + " : " + (a + b+ c));
    }
}
