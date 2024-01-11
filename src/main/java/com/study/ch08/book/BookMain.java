package com.study.ch08.book;

import javax.swing.*;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String selectMenu = null;
        boolean loopFlag = true;

        String title = null;
        String author = null;

        Book[] books = new Book[3];

        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);



        while(loopFlag) {
            System.out.println("<< 도서 리스트 프로그램 >>");
            System.out.println("1. 책 등록");
            System.out.println("2. 등록 리스트");
            System.out.println("q. 프로그램 종료");
            System.out.print("★번호 선택: ");
            selectMenu = scan.nextLine();
            if("q".equalsIgnoreCase(selectMenu)) {
                System.out.println("띵,프로그램을 종료하겠습니다.");
                break;

            }else if("1".equals(selectMenu)) {
                if(bookService.isFull()) {
                    System.out.println("공간이 가득찼습니다");
                    continue;
                }

                System.out.println("<< 책 정보를 입력하세요 >>");
                System.out.print("책 제목: ");
                title = scan.nextLine();
                System.out.print("책 저자: ");
                author = scan.nextLine();

                Book book = new Book(title, author);

                for(int i = 0; i < books.length; i++){ //등록한 정보 쌓기
                    if(books[i] == null) {
                        books[i] = book;
                        break;
                    }
                }

                System.out.println("등록되었습니다");

            }else if("2".equals(selectMenu)) {
                System.out.println("<< 등록된 책 리스트 >>");

                for(int i = 0; i < books.length; i++) { //등록한 정보 보기
                    if(books[i] == null) {
                        System.out.println("등록된 책이 없습니다" + "\n" +"뒤로 돌아갑니다");
                        break;

                    }else {
                        System.out.println(books[i].toString());
                    }
                }

            }else {
                System.out.println("잘못입력하셨습니다. 다시 입력하시오.");
            }
        }
    }
}
