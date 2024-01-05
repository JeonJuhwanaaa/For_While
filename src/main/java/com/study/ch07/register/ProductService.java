package com.study.ch07.register;

public class ProductService {

    boolean isEmptyString(String str) {
        if (str == null) {
            return true;
        }
        return str.isBlank();
    }

    void registerProductService(Product product) { //메인에서 호출받은 게 이 메소드가 실행
        ProductRepository productRepository = new ProductRepository();

        System.out.println("서비스까지 데이터 전달함.");

        productRepository.saveProduct(product); // 여기서 또 호출하면서 Repository 클래스를 호출


    }

}
