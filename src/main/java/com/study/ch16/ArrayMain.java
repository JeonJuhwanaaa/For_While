package com.study.ch16;

public class ArrayMain {

    public static void main(String[] args) {

        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("김준일");
        arrayService.add("홍길동");
        arrayService.add("길동");
        arrayService.add("동길");
        arrayService.add("동길홍");
        arrayService.add("길동홍");

        //배열에 추가
        System.out.println(arrayService.toString());
        //배열에 있는 값 제거
        arrayService.remove(2);
        System.out.println(arrayService);
        //배열에 있는 값 꺼내오기
        System.out.println(arrayService.get(3));
        //index
        System.out.println(arrayService.indexOf("동길홍"));
    }
}
