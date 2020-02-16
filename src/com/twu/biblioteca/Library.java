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
        if (bookList.stream().filter((booksAvailable)).count()>0) {
            bookList.stream().filter((booksAvailable)).forEach((book) -> System.out.println(book.toString()));
        }else {
            System.out.println("There is no book available to checkout");
        }
    }

    public static void showCheckoutBookList(){
        System.out.println( "----------------------------------------------------------------------------------\n"+
                "BOOK LIST - RETURN AVAILABLE : \n");
        Predicate<Book> booksNotAvailable = book -> book.isAvailable() == false;
        if (bookList.stream().filter((booksNotAvailable)).count()>0) {
            bookList.stream().filter((booksNotAvailable)).forEach((book) -> System.out.println(book.toString()));
        }else {
            System.out.println("There is no book available to return");
        }
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