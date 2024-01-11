package com.study.ch18;

public class AdditionMain {
    public static void main(String[] args) {

        //익명 클래스
        Addition addition1 = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
        Addition addition2 = new AdditionImpl();

        System.out.println(addition1.add(10, 20));
        System.out.println(addition2.add(30, 40));

        //<<람다식>>
        //람다식 핵심조건 -> 인터페이스 안에 딱 하나의 추상메소드만 정의되어 있어야한다!
        //단, 일반(default) 메소드는 여러개 정의되어 있어도 된다.
        //-> 화살표함수, add함수명
        //람다식은 매개변수의 변수명은 바껴도 상관없다 자료형만 같으면 된다
        Addition addition3 = (int x, int y) -> {
            System.out.println("람다식으로 구현한 add메소드");
            return x + y;
        };
        System.out.println(addition3.add(50, 60));

        //1.람다식의 매개변수 자료형은 생략할 수 있다.
        Addition addition4 = (x,y) -> {
            return x + y;
        };
        //2.함수의 실행문이 하나(둘은 xx)의 명령문만 실행된다면 중괄호를 생략할수 있다.
        //단, return은 중괄호를 생략할 시 같이 생략한다.
        Addition addition5 = (x,y) -> x + y;

        //viewer는 void라서 리턴 x
        Viewer viewer1 = (viewData) -> {
            System.out.println("화면출력");
        };
        //위에 Viewer를 중괄호 생략하면
        Viewer viewer2 = (viewData) -> System.out.println("화면출력");

        //3.매개변수가 1개면 매개변수의 괄호도 생략할수있다.
        Viewer viewer3 = viewData -> System.out.println("화면출력");

    }
}
