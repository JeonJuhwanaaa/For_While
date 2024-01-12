package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {

    //예외

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("홍길동");
        nameList.add("길동");
        nameList.add(null);
        nameList.add("동길홍");

        try {
            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                if (name.equals("동길홍")) {
                    System.out.println("동길홍을 찾음!");
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("이거는 무조건 실행됨");
        }


        System.out.println("프로그램 정상 종료");
    }
}
