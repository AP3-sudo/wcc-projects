//Programmer: Albert Putranegoro & Nabil Dipo
//Class: CS145
//Date: 10/25/2022
//Assignment: Assignment 2 Phonebook
//Purpose: The program will run a phonebook

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class phonebookManager {
    // to add new entry
    private LinkedList<listNode> phoneBook;
    phonebookManager() {
        this.phoneBook = new LinkedList<>();
    }
    public boolean addNewEntry(String firstName, String lastName, String address, String city, String mobile) {
        return this.phoneBook.add(new listNode(firstName, lastName, address, city, mobile));
    }
    // phonebook manager to showcase entry modifications, if they work it or not.
    public void modifyEntry(String firstName, String val, int param) {
        for(listNode contact: this.phoneBook) {
            if(contact.getFirstName().equals(firstName)) {
                if (param == 1) contact.setFirstName(val);
                else if(param == 2) contact.setLastName(val);
                else if(param == 3) contact.setAddress(val);
                else if(param == 4) contact.setMobile(val);
                else if(param == 5) contact.setCity(val);
                else {
                    System.out.println("Entry Changed");
                    return;
                }

                System.out.println("Entry Change Unsuccessful");
                return;
            }
        }
        System.out.println("Entry Change Unsuccessful");
    }
    // Entry deleted
    public void deleteEntry(String firstName) {
        for(listNode contact: this.phoneBook) {
            if(contact.getFirstName().equals(firstName)){
                this.phoneBook.remove(contact);
                System.out.println("Entry Deleted");
                return;
            }
        }
        System.out.println("Entry Deletion Unsuccessful");
    }
    // displaying the phonebook
    public void displayPhoneBook() {
        for(listNode contact: this.phoneBook) {
            System.out.println(contact.toString());
        }
        System.out.println();
        System.out.println();
    }
    // to sort phonebook by last name
    public void sortPhoneBookByLastName() {
        Collections.sort(this.phoneBook, new Comparator<listNode>() {
            public int compare(listNode o1, listNode o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }
}