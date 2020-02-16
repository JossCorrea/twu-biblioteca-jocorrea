package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    String menuOptions = "----------------------------------------------------------------------------------\n" +
            "MAIN MENU :\n\n" +
            "1 - List of books\n" +
            "2 - Checkout book\n" +
            "3 - Return book\n" +
            "4 - Quit";
    int selectedOption;


    public void showMainMenu() {
        System.out.println(menuOptions);
    }

    public void selectOption() {
        System.out.print("----------------------------------------------------------------------------------\n" +
                "Enter the number of your option in menu ----> ");
        Scanner scan = new Scanner(System.in);
        this.selectedOption = Integer.parseInt(scan.next());
        Book selectedBook = null;

        switch (this.selectedOption) {
            case 1:
                Library.showBookList();
                break;
            case 2:
                Library.showBookList();
                selectedBook = selectBook();
                selectedBook.checkoutBook();
                break;
            case 3:
                Library.showCheckoutBookList();
                selectedBook = selectBook();
                selectedBook.returnBook();
                break;
            case 4:
                BibliotecaApp.quitApp();
                break;
            default:
                System.out.println("Please select a valid option!");
        }
        System.out.println(menuOptions);

    }

    private Book selectBook() {
        System.out.print("----------------------------------------------------------------------------------\n" +
                "Enter the id number of the book ----> ");
        Scanner selectedIdBook = new Scanner(System.in);
        int bookId = Integer.parseInt(selectedIdBook.next());
        for (Book book : Library.bookList) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

//        try{
//            while(yes==0){
//                System.out.print("Enter your choice:");
//                ch=sc.nextInt();
//                switch(ch){
//                    case 1:
//                        System.out.print("Value:");
//                        val=sc.nextInt();
//                        System.out.print("Position:");pos=sc.nextInt();
//                        mylist.insert(val,pos);
//                        break;
//                    case 2:
//                        System.out.print("Position:");
//                        pos=sc.nextInt();
//                        mylist.delete(pos);
//                        break;
//                    case 3:
//
//
//
//                        System.out.println("Number of items:"+mylist.countitem());
//                        break;
//                    case 4:
//
//                        if (mylist.findmin() != null && mylist.findmax() != null){
//
//                            System.out.println("Min item:"+mylist.findmin().val);
//
//                            System.out.println("Max item:"+mylist.findmax().val);
//                        }
//                        break;
//                    case 5:
//                        System.out.println("Find what:");
//                        val=sc.nextInt();
//                        mylist.temp=mylist.find(val);
//
//
//
//                        if(mylist.temp!=null) System.out.println("Found "+mylist.temp.val);
//                        else System.out.println("Not found!");
//                        break;
//                    case 6:
//                        System.out.println("All items:");
//                        mylist.printall();
//                        break;
//                    case 7: System.exit(0);
//
//                    default: System.out.println("Invalid choice!");


}
