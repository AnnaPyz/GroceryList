package com.annapyzel;

import java.util.ArrayList;
import java.util.Scanner;

//first java code on github, xxx

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.print("Please give your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress:");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To process array list.");
        System.out.println("\t 7 - To quit the application.");
    }
    public static void addItem(){
        System.out.print("Please enter the name:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void printGroceryList(){
        System.out.print("Grocery list:");
        groceryList.printGroceryList();
    }
    public static void modifyItem(){
        System.out.print("Current item name:");
        String itemName = scanner.nextLine();
        System.out.print("New item name:");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);
    }
    public static void removeItem(){
        System.out.print("Enter item name:");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }
    public static void searchForItem(){
        System.out.print("Enter item name:");
        String itemName = scanner.nextLine();
        if(groceryList.onFile(itemName)){
            System.out.println(itemName + " is on the list.");
        }
        else {
            System.out.println(itemName + " is not on the list.");
        }
    }
    public static void processArrayList(){
        ArrayList<String>newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[]myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
