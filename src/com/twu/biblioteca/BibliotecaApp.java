package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private static boolean isActivated = true;

    public static void main(String[] args) {
        showWelcomeMessage();
        Menu menu = new Menu();
        menu.showMainMenu();
        while (isActivated) {
            menu.selectOption();
            System.out.println(isActivated);
        }
    }

    public static void showWelcomeMessage(){
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book in Bangalore!";
        System.out.println(welcomeMessage);
    }

    public static void quitApp(){
        isActivated = false;
    }

    public static boolean isIsActivated() {
        return isActivated;
    }


}
