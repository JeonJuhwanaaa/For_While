package com.study.ch14;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("김준일", "01000000000", "동래구", 31);
        System.out.println(student);

        Student2 student2 = new Student2("김준일", "01000000000");
        System.out.println(student2);
    }
}
