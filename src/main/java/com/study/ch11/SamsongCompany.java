package com.study.ch11;

public class SamsongCompany {

    //static = 고정됨
    static String name = "삼성"; //static 을 붙이는 순간 이 클래스에 고정 즉, 생성하지않고 .(점)만 붙여서 가져올수있다

    static void showCompanyInfo(){
        System.out.println("회사명: " + name);

    }
}
