package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List bookList = new ArrayList();

    private static void loadBookList(){
        bookList.add(new Book("A",2015));
        bookList.add(new Book("B",2019));
    }

    public static void showBookList(){
        loadBookList();
        bookList.forEach((book) -> System.out.println(book.toString()));
    }
}
