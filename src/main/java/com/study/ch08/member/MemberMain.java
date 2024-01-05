package com.study.ch08.member;

import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        Member[] members = new Member[3];


        String selectedMenu = null;

        while(true) {  //while문 안에 switch가 들어가서 무한루프가 돌 때 멈추기 위해선 ...을 쓴다 또는 while문 대신 if를 쓴다
            System.out.println("[[회원 관리 프로그램]]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("q. 프로그램 종료하기");

            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();

            if (("1".equals(selectedMenu))) { //1이라는 값과 select 값이 같다면 선택
                int emptyCount = 0; //조회했을 때 빈칸이 있는지 확인 빈칸이 없다면 더이상 등록할수없음
                for(int i = 0; i < members.length; i++) {
                    if(members[i] == null) {
                        emptyCount++;
                    }
                }
                if(emptyCount == 0) {
                    System.out.println("더 이상 회원을 등록할 수 없습니다.");
                    continue;
                }

                boolean responseData = memberService.addMember(members);
                if (responseData) {
                    System.out.println("<<< 회원 등록 완료 >>>");
                } else {
                    System.out.println("<<< 회원 등록 취소 >>>");
                }

            }else if("2".equals(selectedMenu)) {
                System.out.println("<<< 회원 전체 조회 >>>");
                for(int i = 0; i < members.length; i++) {
                    if(members[i] == null){
                        System.out.println("NULL");
                        continue;
                    }
                    System.out.println(members[i].toString());
                }
            }else if("q".equalsIgnoreCase(selectedMenu)) { //equalsIgnoreCase = 대.소문자 구분없이 같으면 참
                break;
            }else {
                System.out.println("다시 선택하세요.");
            }

            System.out.println();

        }
        System.out.println();
        System.out.println("<<<<<< 프로그램이 종료되었습니다 >>>>>>");

    }
}