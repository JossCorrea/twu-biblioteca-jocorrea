package com.twu.biblioteca;

import static com.twu.biblioteca.Constants.WELCOME_MESSAGE;

public class BibliotecaApp {

    public static boolean isActivated = true;

    public static void main(String[] args) {
        showWelcomeMessage();

        Library.loadDataBooklist();

        Menu menu = new Menu();
        menu.showMainMenu();
        while (isActivated) {
            menu.selectOption();
        }
    }

    public static void showWelcomeMessage(){
        String welcomeMessage = WELCOME_MESSAGE;
        System.out.println(welcomeMessage);
    }

    public static void quitApp(){
        isActivated = false;
    }

}
