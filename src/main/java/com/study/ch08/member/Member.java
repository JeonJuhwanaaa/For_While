package com.study.ch08.member;

public class Member {

    String code;
    String name;
    int age;
    String address;

    Member(String code, String name, int age, String address) { // *단축기 Alt+Ins 하고 Construct*
        this.code = code;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() { //  *단축기Alt+Ins 하고 toString*
        return "Member{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
