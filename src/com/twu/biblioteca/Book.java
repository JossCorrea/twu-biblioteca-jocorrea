package com.twu.biblioteca;

public class Book {
    String author;
    int yearPublished;

    public Book(String author, int yearPublished) {
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Author: " + author + " - Year Published: " + yearPublished ;
    }
}
