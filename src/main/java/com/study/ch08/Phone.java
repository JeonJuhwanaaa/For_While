package com.study.ch08;

public class Phone {

    String company;
    String modelName;

    Phone(String company, String modelName) { // Alr+ Ins -> construct 단축기
        this.company = company;
        this.modelName = modelName;
    }

    @Override
    public String toString() {  // Alr+ Ins -> toString 단축기
        return "Phone {" +
                "company='" + company + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
