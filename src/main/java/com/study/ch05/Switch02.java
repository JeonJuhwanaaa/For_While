package com.study.ch05;

import java.util.Scanner;

public class Switch02 {
    public static boolean select() {                //클래스
        Scanner scan = new Scanner(System.in);
        System.out.print("여기서 멈출까요(y/n)? ");
        String value = scan.next();
        return "y".equals(value) || "Y".equals(value); //만약 y 가 value 값이랑 같다면 참

        }

    public static void main(String[] args) {       // 메인
        int num = 1;

        System.out.println("게임 시작");
        switch (num) {
            case 1:
                System.out.println("1단계 시작");
                if(select()) { //값이 참이라면 (y 또는 Y가 value 값이랑 같다면 브레이크 아니면 다음단계로 이동)
                    break;
                }
            case 2:
                System.out.println("2단계 시작");
                if(select()) {
                    break;
                }
            case 3:
                System.out.println("3단계 시작");
                if(select()) {
                    break;
                }
            case 4:
                System.out.println("4단계 시작");
                if(select()) {
                    break;
                }
            case 5:
                System.out.println("마지막단계 시작");
        }
    }
}
