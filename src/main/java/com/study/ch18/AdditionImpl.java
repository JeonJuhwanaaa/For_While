package com.study.ch18;

public class AdditionImpl implements Addition{
    @Override//재정의 하면서 변수명은 바꿔도상관없다 자료형만 같으면 된다
    public int add(int x, int y) {
        System.out.println("AdditionImpl에서 호출한 add 메소드");
        return x + y;
    }
}
