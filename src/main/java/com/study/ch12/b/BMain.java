package com.study.ch12.b;

import com.study.ch12.a.Student; //import 는 외부에서 갖고온다는 뜻, 즉 다른 페키지에서 데이터를 갖고온다

public class BMain {

    public static void main(String[] args) {

        Student student = new Student();
        student.test();

    }
}
