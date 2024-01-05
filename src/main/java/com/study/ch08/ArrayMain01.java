package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 20;


        // 배열(Array) - []
        int[] numArray; //선언

        numArray = new int[3]; //값(주소) 대입 , 인덱스 3개를 만듦 = 0인덱스, 1인덱스, 2인덱스

        System.out.println(numArray);

        numArray[0] = 10; //0번 인덱스에 10이라는 값을 대입
        System.out.println(numArray[0]); // []안에 숫자는 index , 무조건 0부터 시작 즉, 하나의 방이라고 생각
        numArray[1] = 20; //1번 인덱스에 20이라는 값을 대입
        numArray[2] = 30; //2번 인덱스에 30이라는 값을 대입

        Scanner scanner = new Scanner(System.in);
        System.out.print("인덱스: ");
        int index = scanner.nextInt();

        System.out.println(numArray[index]);


    }
}
