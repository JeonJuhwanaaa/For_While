package com.study.ch14;

import java.util.Objects;
import java.util.Scanner;

/*
 *
 **<< Object Class >>**
 *  기본적으로 모든 class 들은 object 클래스를 상속받고있다(아무것도 안적혀있을 때는 생략되고있는 것)
 *  object 클래스는 다중상속 가능
 *
 * toString
 * equals
 * getClass
 * hashCode
 *
 * */

public class ObjectTest {


    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
