package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("번호 선택: ");
        num = scan.nextInt();

        switch (num) { //num에 어떤 숫자가 들어가냐에 따라 그에 맞는 case를 찾아가서 거기서부터 출력, 중간에 break가 있다면 거기서 멈춤
            case 0:
                System.out.println("0선택");
                break; // 여기서 멈춤
            case 1:
                System.out.println("1선택");
                break;
            case 2:
                System.out.println("2선택");
                break;
            default: // ??
                System.out.println("오류");
        }
    }
}
