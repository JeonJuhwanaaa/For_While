package com.study.ch08.book;

import com.study.ch08.car.Car;

public class BookService {

    BookRepository bookRepository;

    BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    boolean isFull(){
        return bookRepository.getIndex() == -1;
    }
    void append(Book book) {
        bookRepository.insert(book);
    }
}
