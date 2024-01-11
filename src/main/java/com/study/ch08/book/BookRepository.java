package com.study.ch08.book;

public class BookRepository {

    final Book[] books;

    BookRepository(Book[] books){
        this.books = books;
    }

    int getIndex() {
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                return 1;
            }
        }
        return -1;
    }

    void insert(Book book) {
        books[getIndex()] = book;
    }





}
