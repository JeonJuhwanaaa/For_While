package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        //map -> 순서xx
        //집어넣기 - put(key 값,value 값)
        //값의 중복은 가능,키 값은 중복xx
        map.put("username", "junil");
        map.put("password", "1243");
        map.put("3번학생", "김준삼");
        map.put("email", "wedsf@naver.com");

        System.out.println(map);
        //키 값이 있기때문에 get 사용가능
        //키값으로 value값을 불러오기 가능
        System.out.println(map.get("email"));
    }
}
