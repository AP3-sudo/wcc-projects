//Programmer: Albert Putranegoro & Nabil Dipo
//Class: CS145
//Date: 10/25/2022
//Assignment: Assignment 2 Phonebook
//Purpose: The program will run a phonebook

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
        // Entry options
        public static void printMainMenu() {
            System.out.println("Enter entry by Name, Last Name, Address, City, Mobile (click enter once each part is filled)");
            System.out.println("Choose (1-6): ");
            System.out.println("1: New Entry");
            System.out.println("2: Edit Entry");
            System.out.println("3: Delete Entry");
            System.out.println("4: Sort Entries");
            System.out.println("5: Show Entries");
            System.out.println("6: Exit");
        }
        // For entering options
        public static phonebookManager showAddMenu(phonebookManager manager) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter New Entry Details");
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            String address = sc.nextLine();
            String city = sc.nextLine();
            String mobile = sc.nextLine();

            manager.addNewEntry(firstName, lastName, address, city, mobile);
            return manager;
        }
        // For deleting name
        public static phonebookManager showDeleteMenu(phonebookManager manager) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name to Delete");
            String firstName = sc.nextLine();

            manager.deleteEntry(firstName);
            return manager;
        }
        // To choose modification settings
        public static phonebookManager showModifyMenu(phonebookManager manager) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter First Name to Modify Entry");
            String firstName = sc.nextLine();
            System.out.println("What Would You Lke to Modify - ");
            System.out.println("1: First Name");
            System.out.println("2: Last Name");
            System.out.println("3: Address");
            System.out.println("4: City");
            System.out.println("5: Mobile Number");
            System.out.println("Type (1-5): ");
            int param = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter New Value");
            String val = sc.nextLine();

            manager.modifyEntry(firstName, val, param);
            return manager;
        }
        // Sorting phonebook by last name
        public static phonebookManager sortPhoneBook(phonebookManager manager) {
            System.out.println("Sorted by Last Name");
            manager.sortPhoneBookByLastName();

            return manager;
        }
        // for user choices, to move on next step
        public static void main(String[] args) {
            phonebookManager manager = new phonebookManager();
            Scanner sc = new Scanner(System.in);
            while(true) {
                printMainMenu();
                int choice = sc.nextInt();
                if(choice > 6 || choice <= 0) {
                    System.out.println("\n Invalid, enter a choice between 1-6\n");
                    continue;
                }
                if(choice == 1) manager = showAddMenu(manager);
                else if(choice == 2) manager = showModifyMenu(manager);
                else if(choice == 3) manager = showDeleteMenu(manager);
                else if(choice == 4) manager = sortPhoneBook(manager);
                else if(choice == 5) manager.displayPhoneBook();
                else break;
            }
            System.out.println("End");
        }
    }
