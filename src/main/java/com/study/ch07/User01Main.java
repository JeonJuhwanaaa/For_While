package com.study.ch07;

public class User01Main {
    public static void main(String[] args) {

        User01 user1 = new User01("aaa", "1111");
        User01 user2 = new User01("bbb", "2222", "전주환", "w7285@naver.com");

        user1.showInfo();
        System.out.println("--------------------------------------------");

        user2.showInfo();
        System.out.println("--------------------------------------------");

        user1.setName("전주환");
        user1.setEmail("123@naver.com");

        user1.showInfo();

        System.out.println("--------------------------------------------");

        user2.setName("전땡댕");
        user2.setEmail("456@naver.com");

        user2.showInfo();
    }
}
