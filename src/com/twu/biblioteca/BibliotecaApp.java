package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp.showWelcomeMessage();

        Menu menu = new Menu();
        menu.showMainMenu();
    }

    private static void showWelcomeMessage(){
        String welcomeMessage = "Hello, you are welcome to Biblioteca!";
        System.out.println(welcomeMessage);
    }
}
