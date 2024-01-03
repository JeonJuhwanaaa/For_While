package com.study.ch06;

public class For01 {

    public static void main(String[] args) {
        //반복문 -for문 (초기화문; 조건문(참일때 반복,거짓이면 스탑); 후처리문) / while문
        // 순서: 초기화문(선언은 최초한번만) > 조건문 > print 실행문 > 후처리문 순서
        for( int i = 0; i < 10; i++) { //i가 0~9까지 1씩 추가하면서 반복출력, (반복횟수를 일정하게 증가시키면서 반복돼야할 때),반복횟수가 중심o, 조건이 중심x
            System.out.println("i: " + i);
        }

        int i = 0;
        while (i< 10){ //여기서부터 필수, if처럼 조건만 들어간다, (조건이 중심)
            System.out.println("i: " + i);
            i++;
        }
    }
}
