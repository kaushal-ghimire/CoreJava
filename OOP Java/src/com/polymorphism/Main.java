package com.polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = scan.nextLine();

        //user input..
        System.out.println("Enter age: ");
        int age = scan.nextInt();

        // output name & age......

        System.out.println("Username: " + username); //console output...
        System.out.println("Age: " +age);

        Scanner scan2 = new Scanner(System.in);
        //input username
        System.out.println("Enter loved names: ");
        String name = scan2.nextLine();
        System.out.println("Enter his/her age: ");
        int age2 = scan2.nextInt();

        //output username
        System.out.println("Loved ones: " +name);
        System.out.println("Age: " + age2);





    }
}
