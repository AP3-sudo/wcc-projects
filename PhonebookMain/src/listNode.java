//Programmer: Albert Putranegoro & Nabil Dipo
//Class: CS145
//Date: 10/25/2022
//Assignment: Assignment 2 Phonebook
//Purpose: The program will run a phonebook

public class listNode {
    // variables for the entries needed
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String mobile;

    // variables of 6 names
    public listNode(String firstName, String lastName, String address, String city, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.mobile = mobile;
    }

    @Override
    // To format what to print
    public String toString() {
        return "Full Name: '" + firstName + " " + lastName + '\'' +
                ", Address: '" + address + '\'' +
                ", City: '" + city + '\'' +
                ", Mobile: '" + mobile + '\'';
    }
    //Get firstName
    public String getFirstName() {
        return firstName;
    }
    //Get lastName
    public String getLastName() {
        return lastName;
    }
    //Set firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //Set lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Get address
    public String getAddress() {
        return address;
    }
    //Set address
    public void setAddress(String address) {
        this.address = address;
    }
    //Get city
    public String getCity() {
        return city;
    }
    //Set city
    public void setCity(String city) {
        this.city = city;
    }
    //Get mobile
    public String getMobile() {
        return mobile;
    }
    //Set mobile
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}