package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {

        //제네릭 <String> T 자리에 String 타입이 들어간다 앞에 <(타입)> 입력하면 new 뒤에는 생략가능
        //제네릭 <>를 사용 안하면 기본적으로 Object 가 들어간 것
        //제네릭은 일반자료형 사용불가 , int 는 integer 를 사용
        SendData<String> sendData1 = new SendData<>(200, "김준일");
//        send(sendData1);
        //제네릭 <Member> T 자리에 Member 타입이 들어간다
        SendData<Member> sendData2 = new SendData<>(200, new Member("김준일", "01000000000"));
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김준이", "01000000000"));
        send(sendData3);
    }

    //<?> - 와일드카드 , 리턴 자료형이 sendDate1을 보낼지 2를 보낼지 모를 때 사용하면 둘다 받을 수 있음
    // extends Member (위에서 아래로)를 붙임으로써 Member 를 상속받은 Class 만으로 제한 걸기
    // super VipMember (아래에서 위로)를 붙임으로써 VipMember 랑 VipMember 의 부모만 으로 제한걸기
    public static void send(SendData<? super VipMember> sendData){
        sendData.send();
    }
}
