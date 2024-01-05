package com.study.ch08;

public class ArrayMain02 {

    public static void main(String[] args) {

        String[] names = new String[4];
        names[0] = "홍길동";
        names[1] = "홍길";
        names[2] = "홍";
        names[3] = "홍홍";

        for(int i = 0; i < names.length; i++){ // length(배열의 크기) => 4
            System.out.println(names[i]);

        }



    }
}
