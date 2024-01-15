package com.study.exam;

public class Factory {

    private static Factory instance;

    private String factoryName;

    private Factory(){

    }

    static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }
}
