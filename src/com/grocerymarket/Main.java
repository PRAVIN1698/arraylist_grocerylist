package com.grocerymarket;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Grocerylist grocerylist = new Grocerylist();


    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0 :
                    printInstruction();
                    break;
                case 1:
                    grocerylist.Printgrocerylist();
                    break;
                case 2:
                    additem();
                    break;
                case 3:
                    modifyitem();
                    break;
                case 4:
                    removeGrocery();
                    break;
                case 5:
                    findItem();
                    break;
                default:
                    quit=true;
                    break;




            }


        }


    }
    private static void printInstruction() {


        System.out.println("\n welcome press the button");
        System.out.println("\t 0 to print grocery ");
        System.out.println("\t 1 to print grocerylist ");
        System.out.println("\t 2 to add item ");
        System.out.println("\t 3 to modifyitem ");
        System.out.println("\t 4 to removeitem ");
        System.out.println("\t 5 to finditem");
        System.out.println("\t 6 to quit ");

    }
    public static void additem() {
        System.out.print("Please Enter the item: ");
        grocerylist.addgroceryitem(sc.nextLine());



    }
    public static void modifyitem() {
        System.out.print("Enter replacement item: ");
        String newitem = sc.nextLine();
        System.out.print("Please Enter the number: ");
        int itemno = sc.nextInt();
        System.out.print("\n");
        grocerylist.modif_item((itemno - 1),newitem);

    }

    public static void removeGrocery() {
        System.out.println("Please Enter the number to remove item: ");
        int removeitem = sc.nextInt();
        grocerylist.removeGrocery(removeitem);

    }

    public static void findItem() {
        System.out.print("Please neter the number to search item: ");
        String searchitem = sc.nextLine();
        if (grocerylist.findItem(searchitem) != null) {
            System.out.println("Found " + searchitem + " in  our grocerlist");
        } else {
            System.out.println("not there");
        }

    }








}

