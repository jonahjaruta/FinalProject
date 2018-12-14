package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declare *****
        Scanner keyboard;
        double SupplyAmount;

        double SalesDays;

        double SupplyOneCost;
        double SupplyTwoCost;
        double SupplyThreeCost;
        double SupplyFourCost;
        double SupplyFiveCost;
        double SupplySixCost;
        double SupplyCostTotal;
        //declare end *****

        String[] SupplyOptions;


        //initialize
        keyboard = new Scanner (System.in);

        System.out.println("How many different supplies are required?");
        SupplyAmount = keyboard.nextDouble();

        if (SupplyAmount == 1) {
            System.out.println("Input supply one cost.");
            SupplyOneCost = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost;
        }
        else if (SupplyAmount == 2) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost + SupplyTwoCost;
        }
        else if (SupplyAmount == 3) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();
            System.out.println("Input supply three cost");
            SupplyThreeCost = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost + SupplyTwoCost + SupplyThreeCost;
        }
        else if (SupplyAmount == 4) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();
            System.out.println("Input supply three cost");
            SupplyThreeCost = keyboard.nextDouble();
            System.out.println("Input supply four cost");
            SupplyFourCost = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost + SupplyTwoCost + SupplyThreeCost + SupplyFourCost;
        }
        else if (SupplyAmount == 5) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();
            System.out.println("Input supply three cost");
            SupplyThreeCost = keyboard.nextDouble();
            System.out.println("Input supply four cost");
            SupplyFourCost = keyboard.nextDouble();
            System.out.println("Input supply five cost");
            SupplyFiveCost = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost + SupplyTwoCost + SupplyThreeCost + SupplyFourCost + SupplyFiveCost;
        }
        else if (SupplyAmount == 6) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();
            System.out.println("Input supply three cost");
            SupplyThreeCost = keyboard.nextDouble();
            System.out.println("Input supply four cost");
            SupplyFourCost = keyboard.nextDouble();
            System.out.println("Input supply five cost");
            SupplyFiveCost = keyboard.nextDouble();
            System.out.println("Input supply six cost");
            SupplySixCost = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost + SupplyTwoCost + SupplyThreeCost + SupplyFourCost + SupplyFiveCost + SupplySixCost;
        }
        







        System.out.println("How many days of sales will there be?");
        SalesDays = keyboard.nextDouble();




    }
}
