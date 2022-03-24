package com.bridgelabz;;
import java.util.*;
import  java.util.Scanner;


public class AddressBook {

    private ArrayList<Person> data=new ArrayList<Person>();
      
    public String readString(String displayMessage){

        Scanner sc = new Scanner(System.in);
        System.out.print(displayMessage);
        String input=sc.nextLine();

        return input;
    }
      
    public long readLong(String displayMessage){

        Scanner sc = new Scanner(System.in);
        System.out.print(displayMessage);
        long input=sc.nextLong();

        return input;
    }
    public int indexOfPerson(){

        System.out.println();
        String name=readString("[+]Enter Person's name: ");
        long phoneNumber= Long.parseLong(String.valueOf(readLong("[+]Enter his/her phone number: ")));

        int index=0;
        for(Person p : this.data)
        {
            if(p.getName().equals(name) && p.getPhoneNumber()==phoneNumber){
                return index;
            }
            ++index;
        }
        return -1;
    }

    /* Address Book Operations */

    public void addPerson(){

        System.out.println();
        String name=readString("[+]Enter Person's name: ");
        String city=readString("[+]Enter where he/she lives first enter City: ");
        String state=readString("[+]Now, enter State: ");
        String address=readString("[+]Now, enter full address: ");
        String zipCode=readString("[+]At last enter, area's Zip Code: ");
        long phoneNumber= Long.parseLong(String.valueOf(readLong("[+]Enter his/her phone number: ")));
        Person newEntry=new Person(name, city, state, address, zipCode, phoneNumber);

        this.data.add(newEntry);
        System.out.println("\n"+name+" added successfully to address book.");
    }
    
    public void editPerson(){

        int index=this.indexOfPerson();

        if(index != -1){
            String options="[+]\tWhat you want to change?\n\t1. City\n\t2. State\n\t3. Address\n\t4. Zip Code\n\t5. PhoneNumber\n: ";
            int choice=(int)readLong(options);

            switch(choice)
            {
                case 1:
                    this.data.get(index).setCity(readString("[+]Enter new City: "));
                    System.out.println("\nEntry Modified");
                    break;
                case 2:
                    this.data.get(index).setState(readString("[+]Enter new State: "));
                    System.out.println("\nEntry Modified");
                    break;
                case 3:
                    this.data.get(index).setAddress(readString("[+]Enter new Address: "));
                    System.out.println("\ntEntry Modified");
                    break;
                case 4:
                    this.data.get(index).setZipCode(readString("[+]Enter new Zip Code: "));
                    System.out.println("\nEntry Modified");
                    break;
                case 5:
                    this.data.get(index).setPhoneNumber(String.valueOf(readLong("[+]Enter new Phone number: ")));
                    System.out.println("\nEntry Modified");
                    break;
                default:
                    System.out.println("\ntBad Input!");
            }
        }
        else{

            System.out.println("\ntNo such person found!");
        }
    }
    
    public void deletePerson(){

        int index=this.indexOfPerson();

        if(index != -1){

            Person p=this.data.remove(index);
            System.out.println("\nPerson "+p.getName()+" with mobile number "+p.getPhoneNumber()+" removed successfully.");
        }
        else{

            System.out.println("\ntNo one with these details found!");
        }
    }

    /* Display Methods */
    public void showPerson(){

        int index=this.indexOfPerson();

        if(index != -1){

            this.data.get(index).showPersonsDetails();
        }
        else{

            System.out.println("\n[*]\tNo one with these details found!");
        }
    }
    public void showAllPersons(){

        for(Person p : this.data)
        {
            p.showPersonsDetails();
        }
        if(this.data.isEmpty()){

            System.out.println("\ntAddress Book is empty!\n");
        }
    }


    public void runMenu(){
        System.out.println("\n[*]\t"+name+" added successfully to address book.");
    }
    public void editPerson(){

        int index=this.indexOfPerson();

        if(index != -1){
            String options="[+]\tWhat you want to change?\n\t1. City\n\t2. State\n\t3. Address\n\t4. Zip Code\n\t5. PhoneNumber\n: ";
            int choice=(int)readLong(options);

            switch(choice)
            {
                case 1:
                    this.data.get(index).setCity(readString("[+]Enter new City: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                case 2:
                    this.data.get(index).setState(readString("[+]Enter new State: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                case 3:
                    this.data.get(index).setAddress(readString("[+]Enter new Address: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                case 4:
                    this.data.get(index).setZipCode(readString("[+]Enter new Zip Code: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                case 5:
                    this.data.get(index).setPhoneNumber(String.valueOf(readLong("[+]Enter new Phone number: ")));
                    System.out.println("[*]\tEntry Modified");
                    break;
                default:
                    System.out.println("\n[*]\tBad Input!");
            }
        }
        else{

            System.out.println("\n[*]\tNo such person found!");
        }
    }


    /* Display Methods */
    public void showPerson(){

        int index=this.indexOfPerson();

        if(index != -1){

            this.data.get(index).showPersonsDetails();
        }
        else{

            System.out.println("\n[*]\tNo one with these details found!");
        }
    }
    public void showAllPersons(){

        for(Person p : this.data)
        {
            p.showPersonsDetails();
        }
        if(this.data.isEmpty()){

            System.out.println("\n\n[*]\t\tAddress Book is empty!\t\t\n");
        }
    }

    /* Operations Respective Method Caller */
    public void runMenu(){
        long choice=-1;
        while(choice != 0)
        {
            System.out.println("| 1. Add a person");
            System.out.println("| 2. Edit a person");
            System.out.println("| 3. Delete a person");
            System.out.println("| 4. Show a person");
            System.out.println("| 5. Show all persons");
            System.out.println("| 6. Exit");
            choice= Long.parseLong(String.valueOf(readLong("[+]Enter your choice: ")));

            switch((int)choice)
            {
                case 1: addPerson();
                    break;
                case 2: editPerson();
                    break;
                case 3: deletePerson();
                    break;
                case 4: showPerson();
                    break;
                case 5: showAllPersons();
                    break;
                case 6: choice = 0;
                    break;
                default: System.out.println("\nBad Input!");
            }
        }
    }

    public static void main(String[] args) {

        AddressBook newBook=new AddressBook();
        newBook.runMenu();
    }
                default: System.out.println("\n[*]\tBad Input!");
            }
        }
    }
}
