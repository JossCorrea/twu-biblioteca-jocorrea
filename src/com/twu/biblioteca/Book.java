package com.twu.biblioteca;

import org.jetbrains.annotations.NotNull;

public class Book {
    private String author;
    private int yearPublished;
    private boolean isAvailable = true;

    public Book(String author, int yearPublished) {
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return author + " - " + yearPublished ;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkoutBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Thank you! Enjoy the book");
        } else {
            System.out.println("Sorry, that book is not available");
        }
    }

    public void returnBook() {
        if (this.isAvailable) {
            System.out.println("That is not a valid book to return");
        } else {
            this.isAvailable = true;
            System.out.println("Thank you for returning the book");
        }
    }
}
