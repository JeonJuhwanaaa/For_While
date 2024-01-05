package com.study.ch08.member;

import java.util.Scanner;

public class MemberService {


    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while (true) {
            System.out.print(label + "(입력취소: exit): ");
            value = scanner.nextLine();
            if(!value.isBlank()) { //isBlank(=공백이나 띄어쓰기 체크용 즉, 앞에 ! 붙었으니 공백이 아니면 브레이크라는 뜻)
                break;

            }
        }
        return value;
    }


    boolean addMember(Member[] members) {
        String code = null;
        String name = null;
        String age = null;
        String address = null;

        System.out.println("<<< 회원 등록 >>>");
        code = inputValue("회원코드");
        if("exit".equalsIgnoreCase(code)) {
            return false; //exit 라고 입력하면 이전으로
        }
        name = inputValue("이름");
        if("exit".equalsIgnoreCase(name)) {
            return false;
        }
        age = inputValue("나이");
        if("exit".equalsIgnoreCase(age)) {
            return false;
        }
        address = inputValue("주소");
        if("exit".equalsIgnoreCase(address)) {
            return false;
        }


        Member member = new Member(code, name, Integer.parseInt(age), address); //Integer.parseInt(age)는 문자열이었던 age를 int 값으로 변환

        MemberRepository memberRepository = new MemberRepository();

        return memberRepository.insert(members, member) > 0; //memberRepository.insert(member) 은 성공하면 1인데 실패하면
    }
}
