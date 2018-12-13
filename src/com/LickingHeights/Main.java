package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declare
        Scanner keyboard;
        double SupplyAmount;
        double SalesDays;
        double SupplyOneCost;

        //initialize
        keyboard = new Scanner (System.in);

        System.out.println("How many different supplies are required?");
        SupplyAmount = keyboard.nextDouble();

        System.out.println("How many days of sales will there be?");
        SalesDays = keyboard.nextDouble();


        if (SupplyAmount==1) {
            System.out.println("What's the cost of supply 1?");
            SupplyOneCost = keyboard.nextDouble();
        }





    }
}
