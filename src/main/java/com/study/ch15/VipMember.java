package com.study.ch15;

public class VipMember extends Member {

    private final String GRADE = "VIP";

    public VipMember(String name, String phone) {
        //super - 부모클래스의 생성
        super(name, phone);
    }
}
