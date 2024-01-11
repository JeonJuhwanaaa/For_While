package com.study.ch14;

import lombok.*;

//<<< Lombok 사용 >>>
@NoArgsConstructor
@AllArgsConstructor
@Data
// @Date만 만들어줘도 setter,getter,EqualAndHashCod,ToString 만들어진것
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString

public class Student {

    private String name;
    private String phone;
    private String address;
    private int age;

}
