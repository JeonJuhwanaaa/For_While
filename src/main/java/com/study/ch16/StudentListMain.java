package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김준일", 31));
        students.add(new Student("홍길동", 32));
        students.add(new Student("길동", 33));
        students.add(new Student("동", 34));

        System.out.println(students);

        //★★★★중요★★★
        //기존 값에 나이만 1씩 증가하기
        for(int i = 0 ; i < students.size(); i++){
            students.get(i).setAge(students.get(i).getAge() + 1);
        }

        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            student.setAge(students.get(i).getAge()+1);
        }

        //향상된 for문
        for(Student student : students){
            student.setAge(student.getAge() + 1);
        }

//        Student s = new Student("aaa", 10);
//        s.setAge(s.getAge() +1); // 입력된 값에 1 더하기
//        students.get(0).setAge(students.get(0).getAge() +1); //0번째 있던 학생의 나이를 갖고와서 갖고나온 값에 1더하기

        // --------------------------------------------------
        System.out.println(students);

        Student[] studentArray = new Student[4];
        for(int i = 0; i < studentArray.length; i++){
            studentArray[i] = new Student("김준일", 31);
        }

        //위에꺼 향상된 for문 사용하기
        int i = 0;
        for(Student student : studentArray){
            studentArray[i] = new Student("김준일", 31);
            i++;
        }


        for(Student student : studentArray){
            System.out.println(student);
        }
        // --------------------------------------------------
        //0번 인덱스 값의 입력 값을 바꿔라
        students.set(0, new Student("김준일", 31));

    }
}
