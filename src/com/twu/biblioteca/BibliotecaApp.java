package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    List bookList = new ArrayList();

    public static void main(String[] args) {
        showWelcomeMessage();
        showBookList();
//        Menu menu = new Menu();
//        menu.showMainMenu();
//        menu.selectOption();
    }

    public static void showWelcomeMessage(){
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book in Bangalore!";
        System.out.println(welcomeMessage);
    }

    public static void showBookList(){
        List bookList = new ArrayList();
        bookList.add("A");
        bookList.add("B");
        System.out.println(bookList);
    }
}
