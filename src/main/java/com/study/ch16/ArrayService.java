package com.study.ch16;


import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ArrayService {
    private String[] strArray;

    //**배열에 입력값 넣어주기**
    public void add(String str){
        String[] newArray = new String[strArray.length + 1];
        for(int i =0; i < strArray.length; i++){
            newArray[i] = strArray[i];
        }
        strArray = newArray;

        strArray[strArray.length - 1] = str;
    }

    //**배열에 있는 값에서 입력값을 빼주기**
    //기존보다 크기가 1적은 배열을 새로 만든다.
    //매개변수로 받은 인덱스의 값을 기준으로 작은 인덱스들은 그대로 옮기고 큰 인덱스들은 -1하여 옮긴다.
    //strArray 의 배열을 새로운 배열로 바꾼다

    public void remove(int index){
        String[] newArray = new String[strArray.length - 1]; //새로운 배열 만들기
        for(int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i < index ? i : i + 1]; //i가 index보다 작을 때는 i그대로 쓰고 작지않으면 i에 +1 해라
        }
        strArray = newArray;
    }

    public String get(int index){
        return  strArray[index];
    }

    //**배열 중 입력값이 몇 번째에 있는지 찾기**
    public int indexOf(String str){
        if(str == null){
            return -1;
        }
        for(int i = 0; i < strArray.length; i++){
            if(strArray[i].equals(str)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString (){
        String result = "Array[ ";

        for(int i = 0; i < strArray.length; i++){
            result += strArray[i];
            if(i < strArray.length -1 ){
                result += ", ";
            }
        }

        result += " ]";

        return  result;
    }

}
