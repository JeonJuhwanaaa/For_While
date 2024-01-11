package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//웬만하면 필수
@Data

//RequiredArgsConstructor 랑 NoArgsConstructor 는 같이 쓸수없다
@RequiredArgsConstructor
@AllArgsConstructor

public class Student2 {
    //fianl은 상수라서 setter 가 없다
    private final String name;
    private String address;
    @NonNull
    private String phone;
}
