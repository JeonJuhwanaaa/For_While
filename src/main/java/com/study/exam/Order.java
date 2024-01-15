package com.study.exam;
import com.study.ch19.Student;
public class Order {

    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    @Override
    public String toString() {
        return  "주문번호: " + orderId +
                "\n상품명: " + productName +
                "\n구매자: '" + consumerName +
                "\n가격: " + price +
                "\n수량: " + stock + ' ';
    }
    public Order(int orderId, String productName, String consumerName, int price, int stock) {
        this.orderId = orderId;
        this.productName = productName;
        this.consumerName = consumerName;
        this.price = price;
        this.stock = stock;
    }
    public static ShowOrderInfo builder() {
        return new ShowOrderInfo();
    }

    public static class ShowOrderInfo{
        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;

        public Order builer(){
            return new Order(orderId, productName, consumerName, price, stock);
        }

        public ShowOrderInfo orderId(int orderId){
            this.orderId = orderId;
            return this;
        }
        public ShowOrderInfo productName (String productName){
            this.productName = productName;
            return this;
        }
        public ShowOrderInfo consumerName (String consumerName){
            this.consumerName = consumerName;
            return this;
        }
        public ShowOrderInfo price(int price){
            this.price = price;
            return this;
        }
        public ShowOrderInfo stock(int stock){
            this.stock = stock;
            return this;
        }
    }
}
