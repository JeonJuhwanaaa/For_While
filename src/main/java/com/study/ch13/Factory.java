package com.study.ch13;

public class Factory {

    //자기 자신 클래스를 static 변수(변수명: instance)로 가지고 있어야한다.
    private  static Factory instanece;

    private String factoryName;
    private int autoCount;
    private final int DEFAULT_NUMBER = 20240000;

    //생성자는 private으로 외부 생성을 막아준다.
    private Factory(){

    }

    //getter
    public static Factory getInstance() {
        if(instanece == null){
            instanece = new Factory();
        }
        return instanece;
    }

    //setter
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }


    public Car produce(String model) {
        autoCount++;
        return new Car(Integer.toString(DEFAULT_NUMBER + autoCount), model); //Integer.toString 정수를 문자열로 변환
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFAULT_NUMBER=" + DEFAULT_NUMBER +
                '}';
    }
}
