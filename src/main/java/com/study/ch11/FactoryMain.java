package com.study.ch11;

import com.study.ch02.ConstantMain;
import com.study.ch10.Power;

public class FactoryMain {
    public static void main(String[] args) {


        Company company = new Company();
        company.setName("삼성"); //인스턴스는 언제든지 바꿀수있음

        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);




//        SamsongCompany.name = "애플";
//        SamsongCompany.showCompanyInfo(); //생성하지않고 .만 찍어서 가져올수있다

    }
}
