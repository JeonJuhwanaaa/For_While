package com.study.ch14;

public class ObjectMain {

    public static void main(String[] args) {

        //생성
        ObjectTest objectTest = new ObjectTest("김준일", "동래구");

        System.out.println(objectTest.toString());


        //자바만 한정, 이상태로만 해도 toString이 호출된다
        //#toString
        System.out.println(objectTest);

        ObjectTest objectTest1 = new ObjectTest("김준일", "동래구");

        //서로 다른 주소를 가져서 다른객체로 본다
        //#equals
        System.out.println(objectTest.equals(objectTest1));
        System.out.println(objectTest == objectTest1);

        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class); //스테틱 일때 클래스로 호출

        //주소값 비교
        //hashCode
        System.out.println(objectTest.hashCode());
        System.out.println(objectTest1.hashCode());

    }
}
