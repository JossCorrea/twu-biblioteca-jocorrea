package com.twu.biblioteca;


import static com.twu.biblioteca.Constants.*;

public class Book {
    private static int createdBooks = 0;

    public int getId() {
        return id;
    }

    private int id;
    private String author;
    private int yearPublished;
    private boolean isAvailable = true;

    public Book(String author, int yearPublished) {
        this.author = author;
        this.yearPublished = yearPublished;
        this.createdBooks++;
        this.id = createdBooks;
    }

    @Override
    public String toString() {
        return id + " -  " + author + " - " + yearPublished ;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkoutBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println(CHECKOUT_SUCCESS_MESSAGE);
        } else {
            System.out.println(CHECKOUT_UNSUCCESSFUL_MESSAGE);
        }
    }

    public void returnBook() {
        if (this.isAvailable) {
            System.out.println(RETURN_UNSUCCESSFUL_MESSAGE);
        } else {
            this.isAvailable = true;
            System.out.println(RETURN_SUCCESS_MESSAGE);
        }
    }
}
