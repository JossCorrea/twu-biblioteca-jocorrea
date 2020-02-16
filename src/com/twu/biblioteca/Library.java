package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Library{
    public static List<Book> bookList = new ArrayList();

    public static void showBookList(){
        System.out.println( "----------------------------------------------------------------------------------\n"+
                "BOOK LIST : \n");
        Predicate<Book> booksAvailable = book -> book.isAvailable();
        bookList.stream().filter((booksAvailable)).forEach((book) -> System.out.println(book.toString()));
    }

    public static void showCheckoutBookList(){
        System.out.println( "----------------------------------------------------------------------------------\n"+
                "BOOK LIST - RETURN AVAILABLE : \n");
        Predicate<Book> booksNotAvailable = book -> book.isAvailable() == false;
        bookList.stream().filter((booksNotAvailable)).forEach((book) -> System.out.println(book.toString()));
    }

    public static void loadDataBooklist(){
        Book EnsaioSobreACegueira = new Book("José Saramago",1995);
        Book CemAnosDeSolidao = new Book("Gabriel Garcia Marques",1967);
        Book OContoDaAia = new Book("Margaret Atwood",1985);
        Library.bookList.add(EnsaioSobreACegueira);
        Library.bookList.add(CemAnosDeSolidao);
        Library.bookList.add(OContoDaAia);
    }
}