package com.maria.reverseNumber.eggs;

import java.util.Scanner;

public class EggsApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EggsConverter eggs = new EggsConverter();


        System.out.println("Please give a number of eggs");
        eggs.setEggsInput(input.nextInt());
       System.out.println("The number of dozens is: "+ eggs.getEggsDozen());
        System.out.println("The number of gross is: " +eggs.getEggsGross());
        System.out.println("The eggs left over: "+eggs.getEggsLeft());

    }
}
