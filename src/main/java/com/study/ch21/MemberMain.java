package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {
    public static void main(String[] args){

            ArrayList<Member> members = new ArrayList<>();
            members.add(Member.builder().name("홍길동").build());
            members.add(Member.builder().name("전주환").build());
            members.add(Member.builder().name("동동동").build());
            members.add(Member.builder().name("길길길").build());

            MemberService memberService = new MemberServiceImpl();
            try {
                memberService.printMemberList(members);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("프로그램 종료");
        }
    }
