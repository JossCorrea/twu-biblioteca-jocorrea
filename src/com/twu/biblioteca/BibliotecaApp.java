package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        showWelcomeMessage();

        Menu menu = new Menu();
        menu.showMainMenu();
        menu.selectOption();
    }

    public static void showWelcomeMessage(){
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book in Bangalore!";
        System.out.println(welcomeMessage);
    }


}
