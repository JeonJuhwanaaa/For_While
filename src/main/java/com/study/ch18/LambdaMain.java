package com.study.ch18;

import com.study.ch02.ConstantMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {

        //람다식 인터페이스
        //----------------------------------Runnable
        Runnable start = () -> {
            System.out.println("프로그램을 실행합니다");
            System.out.println("데이터를 초기화합니다");
            int a = 10;
            int b = 20;
            //함수안에 함수를 가능
            System.out.println("a+b=" +(a + b));
        };

        start.run();

        //----------------------------------Supplier

        Supplier<Integer> supplier1 = () -> 10;
        int a = supplier1.get();

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);
//        scannerInstance.get().nextLine();

        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);
        };

        setName.accept("김준일");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = str -> System.out.println(str);
        action.accept("김준일");

//        strList.forEach(action);
        strList.forEach(str -> System.out.println(str));

        //----------------------------------Function

        Function<Integer, String> fx1 = num -> Integer.toString(num * num);

        String result = fx1.apply(10);
        System.out.println(result);

        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result2);

        //----------------------------------Predicate

        Predicate<Integer> filterFx = num -> num % 2 == 0;

        List<Integer> numList = new ArrayList<>();
        for(int i=0; i < 10; i++){
            numList.add(i +1);
        }
        System.out.println(numList);

        List<Integer> newList = numList.stream().filter(filterFx).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1 = numList.stream().filter(num -> num %2 ==0).collect(Collectors.toList());
        System.out.println(newList1);

        List<Integer> newList2 = numList.stream().map(num -> num *2).collect(Collectors.toList());
        System.out.println(newList2);

    }
}
