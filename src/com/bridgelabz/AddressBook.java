package com.bridgelabz;

import  java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);


    public static void createAddressBook() {
        System.out.println("\nCreate address book ");
        System.out.println("\n give name to address book ");
        String addressBookName = sc.next();
        System.out.println("Address book name is :" + addressBookName);
    }

    public static void main(String[] args) {
       // int p1 = 0;
        System.out.println("\nEnter first name :");
        String firstName = sc.next();

        System.out.println("\nEnter last name :");
        String lastName = sc.next();

        System.out.println("\nEnter address :");
        String address = sc.next();

        System.out.println("\nEnter state name :");
        String state = sc.next();

        System.out.println("\nEnter zip code :");
        int zip=sc.nextInt();

        System.out.println("\nEnter 10 digit phone number :");
        long phone = sc.nextLong();

        createAddressBook();
    }

}
