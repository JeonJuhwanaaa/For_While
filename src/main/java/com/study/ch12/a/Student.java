package com.study.ch12.a;

public class Student {

    //private 외부에서 접근 불가 (가장 제한적) 본인 클래스에서만 접근가능
    //defaul 동일한 페키지안에서만 가능
    private String name;
    private String address;

    public Student(){

    }
    //생성자
    public Student(String name, String address){
        this.name = name;
        this.address = address;
    }

    //name에 대한 Setter
    public void setName(String name){
        this.name = name;
    }

    //name 에 대한 Getter
    public String getName(){
        return name;
    }

    //address에 대한 getter
    public String getAddress() {
        return address;
    }

    //address에 대한 setter
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public  void test(){
        System.out.println(add(10, 20));
        System.out.println(add(20, 30));
        System.out.println(add(40, 50));
    }

    private int add(int a, int b){
        return  a+b;
    }
}
