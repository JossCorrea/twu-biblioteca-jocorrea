package com.twu.biblioteca;

import org.jetbrains.annotations.NotNull;

public class Book {
    String author;
    int yearPublished;
    boolean isAvailable = true;

    public Book(String author, int yearPublished) {
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Author: " + author + " - Year Published: " + yearPublished ;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkOutBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Thank you! Enjoy the book");
        } else {
            System.out.println("Sorry, that book is not available");
        }
    }
}
