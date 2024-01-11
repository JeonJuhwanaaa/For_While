package com.study.ch08.book;

public class Book {

    String title = null;
    String author = null;

    Book(String title, String author){
        this.title = title;
        this.author = author;

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
