package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Menu {
    String menuOptions = "" +
            "1 - Option 1\n" +
            "2 - Option 2\n" +
            "3 - Option 3\n";
    String selectedOption;


    public void showMainMenu(){
        System.out.println(menuOptions);
    }

    public void selectOption() {
        System.out.print("Enter your choice:");
        Scanner scan = new Scanner(System.in);
        this.selectedOption = scan.next();
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
//
//                }
//
//                mylist.temp=null;//clean temp variable
//                System.out.print("Continue? Press 0 to continue:");
//                yes=sc.nextInt();
//
//            }
//
//        }catch(Exception e){System.exit(100);}


}
