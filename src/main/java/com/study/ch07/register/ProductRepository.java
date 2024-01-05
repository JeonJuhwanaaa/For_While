package com.study.ch07.register;

public class ProductRepository {

    void saveProduct(Product product) { // 메서드 받기
        ProductDB productDB = new ProductDB();
        productDB.insertProduct(product); // 호출

    }
}
