package com.study.ch13;

/*
*
*  company 클래스를 <<싱글톤>> 을 적용하여 구현하시오
*
*
*
* */


public class Company {

    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private  static Company instance;

    private String name;

    //생성자를 private 으로 선언(외부에서 new 사용 x)
    private Company(){

    }

    public static Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }
}
