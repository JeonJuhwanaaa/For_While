package com.study.exam;

public class Main2 {
    public static void main(String[] args) {

        Order.ShowOrderInfo showOrderInfo = Order.builder();
//        Order order1 = showOrderInfo.builer();

        Order order1 = Order.builder()
                .orderId(100)
                .productName("Samsung GalaxyBook2 Pro")
                .consumerName("홍길동")
                .price(1450000)
                .stock(2)
                .builer();

        System.out.print(order1);
    }
}
