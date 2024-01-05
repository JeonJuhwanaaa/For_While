package com.study.ch07.register;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        ProductService productService = new ProductService();

        Scanner scanner = new Scanner(System.in);
        String productName = null;
        String productCode = null;
        long productPrice = 0;

        System.out.println("상품 등록 프로그램");

        System.out.print("삼품 명>>> ");
        productName = scanner.nextLine();
        if(productService.isEmptyString(productName)){
            System.out.println("상품 명을 다시 입력하세요.");
            return;
        }

        System.out.print("삼품 코드번호(예: P20240000)>>> ");
        productCode = scanner.nextLine();
        if(productService.isEmptyString(productCode)){
            System.out.println("상품 코드번호를 다시 입력하세요.");
            return;
        }

        System.out.print("가격>>> ");
        productPrice = scanner.nextLong();

        Product product = new Product(productCode, productCode, productPrice);

        productService.registerProductService(product); // 호출하면서 ProductService 클래스안에 void 메소드 실행

    }
}
