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
        double AmountSupplyOne;
        double AmountSupplyTwo;
        double AmountSupplyThree;
        double AmountSupplyFour;
        double AmountSupplyFive;
        double AmountSupplySix;
        double SupplyCostTotal;
        double CupSalePriceDayOne;
        double CupSalePriceDayTwo;
        double CupSalePriceDayThree;
        double CupSalePriceDayFour;
        double CupSalePriceDayFive;
        double HowManyCupsSoldDayOne;
        double HowManyCupsSoldDayTwo;
        double HowManyCupsSoldDayThree;
        double HowManyCupsSoldDayFour;
        double HowManyCupsSoldDayFive;
        double CupSaleTotal;
        double Profit;
        //declare end *****

        String[] SupplyOptions;


        //initialize
        keyboard = new Scanner (System.in);

        System.out.println("How many days of sales will there be?");
        SalesDays = keyboard.nextDouble();

        System.out.println("How many different supplies are required?");
        SupplyAmount = keyboard.nextDouble();

        if (SupplyAmount == 1) {
            System.out.println("Input supply one cost.");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Amount of supply one?");
            AmountSupplyOne = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost*AmountSupplyOne;
        }
        else if (SupplyAmount == 2) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Amount of supply one?");
            AmountSupplyOne = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();
            System.out.println("Amount of supply two?");
            AmountSupplyTwo = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost*AmountSupplyOne + SupplyTwoCost*AmountSupplyTwo;
        }
        else if (SupplyAmount == 3) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Amount of supply one?");
            AmountSupplyOne = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();
            System.out.println("Amount of supply two?");
            AmountSupplyTwo = keyboard.nextDouble();
            System.out.println("Input supply three cost");
            SupplyThreeCost = keyboard.nextDouble();
            System.out.println("Amount of supply three?");
            AmountSupplyThree = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost*AmountSupplyOne + SupplyTwoCost*AmountSupplyTwo + SupplyThreeCost*AmountSupplyThree;
        }
        else if (SupplyAmount == 4) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Amount of supply one?");
            AmountSupplyOne = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();
            System.out.println("Amount of supply two?");
            AmountSupplyTwo = keyboard.nextDouble();
            System.out.println("Input supply three cost");
            SupplyThreeCost = keyboard.nextDouble();
            System.out.println("Amount of supply three?");
            AmountSupplyThree = keyboard.nextDouble();
            System.out.println("Input supply four cost");
            SupplyFourCost = keyboard.nextDouble();
            System.out.println("Amount of supply four?");
            AmountSupplyFour = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost*AmountSupplyOne + SupplyTwoCost*AmountSupplyTwo + SupplyThreeCost*AmountSupplyThree + SupplyFourCost*AmountSupplyFour;
        }
        else if (SupplyAmount == 5) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Amount of supply one?");
            AmountSupplyOne = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();
            System.out.println("Amount of supply two?");
            AmountSupplyTwo = keyboard.nextDouble();
            System.out.println("Input supply three cost");
            SupplyThreeCost = keyboard.nextDouble();
            System.out.println("Amount of supply three?");
            AmountSupplyThree = keyboard.nextDouble();
            System.out.println("Input supply four cost");
            SupplyFourCost = keyboard.nextDouble();
            System.out.println("Amount of supply four?");
            AmountSupplyFour = keyboard.nextDouble();
            System.out.println("Input supply five cost");
            SupplyFiveCost = keyboard.nextDouble();
            System.out.println("Amount of supply five?");
            AmountSupplyFive = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost*AmountSupplyOne + SupplyTwoCost*AmountSupplyTwo + SupplyThreeCost*AmountSupplyThree + SupplyFourCost*AmountSupplyFour + SupplyFiveCost*AmountSupplyFive;
        }
        else if (SupplyAmount == 6) {
            System.out.println("Input supply one cost");
            SupplyOneCost = keyboard.nextDouble();
            System.out.println("Amount of supply one?");
            AmountSupplyOne = keyboard.nextDouble();
            System.out.println("Input supply two cost.");
            SupplyTwoCost = keyboard.nextDouble();
            System.out.println("Amount of supply two?");
            AmountSupplyTwo = keyboard.nextDouble();
            System.out.println("Input supply three cost");
            SupplyThreeCost = keyboard.nextDouble();
            System.out.println("Amount of supply three?");
            AmountSupplyThree = keyboard.nextDouble();
            System.out.println("Input supply four cost");
            SupplyFourCost = keyboard.nextDouble();
            System.out.println("Amount of supply four?");
            AmountSupplyFour = keyboard.nextDouble();
            System.out.println("Input supply five cost");
            SupplyFiveCost = keyboard.nextDouble();
            System.out.println("Amount of supply five?");
            AmountSupplyFive = keyboard.nextDouble();
            System.out.println("Input supply six cost");
            SupplySixCost = keyboard.nextDouble();
            System.out.println("Amount of supply six?");
            AmountSupplySix = keyboard.nextDouble();

            SupplyCostTotal = SupplyOneCost*AmountSupplyOne + SupplyTwoCost*AmountSupplyTwo + SupplyThreeCost*AmountSupplyThree + SupplyFourCost*AmountSupplyFour + SupplyFiveCost*AmountSupplyFive + SupplySixCost*AmountSupplySix;
        }

        if (SalesDays == 1) {
            System.out.println("How many cups sold on day 1?");
            HowManyCupsSoldDayOne = keyboard.nextDouble();
            System.out.println("Price per cup on day 1?");
            CupSalePriceDayOne = keyboard.nextDouble();

            CupSaleTotal = HowManyCupsSoldDayOne*CupSalePriceDayOne;
        }

        else if (SalesDays == 2) {
            System.out.println("How many cups sold on day 1?");
            HowManyCupsSoldDayOne = keyboard.nextDouble();
            System.out.println("Price per cup on day 1?");
            CupSalePriceDayOne = keyboard.nextDouble();
            System.out.println("How many cups sold on day 2?");
            HowManyCupsSoldDayTwo = keyboard.nextDouble();
            System.out.println("Price per cup on day 2?");
            CupSalePriceDayTwo = keyboard.nextDouble();

            CupSaleTotal = HowManyCupsSoldDayOne*CupSalePriceDayOne + HowManyCupsSoldDayTwo*CupSalePriceDayTwo;
        }
        else if (SalesDays == 3) {
            System.out.println("How many cups sold on day 1?");
            HowManyCupsSoldDayOne = keyboard.nextDouble();
            System.out.println("Price per cup on day 1?");
            CupSalePriceDayOne = keyboard.nextDouble();
            System.out.println("How many cups sold on day 2?");
            HowManyCupsSoldDayTwo = keyboard.nextDouble();
            System.out.println("Price per cup on day 2?");
            CupSalePriceDayTwo = keyboard.nextDouble();
            System.out.println("How many cups sold on day 3?");
            HowManyCupsSoldDayThree = keyboard.nextDouble();
            System.out.println("Price per cup on day 3?");
            CupSalePriceDayThree = keyboard.nextDouble();

            CupSaleTotal = HowManyCupsSoldDayOne*CupSalePriceDayOne + HowManyCupsSoldDayTwo*CupSalePriceDayTwo + HowManyCupsSoldDayThree*CupSalePriceDayThree;
        }
        else if (SalesDays == 4) {
            System.out.println("How many cups sold on day 1?");
            HowManyCupsSoldDayOne = keyboard.nextDouble();
            System.out.println("Price per cup on day 1?");
            CupSalePriceDayOne = keyboard.nextDouble();
            System.out.println("How many cups sold on day 2?");
            HowManyCupsSoldDayTwo = keyboard.nextDouble();
            System.out.println("Price per cup on day 2?");
            CupSalePriceDayTwo = keyboard.nextDouble();
            System.out.println("How many cups sold on day 3?");
            HowManyCupsSoldDayThree = keyboard.nextDouble();
            System.out.println("Price per cup on day 3?");
            CupSalePriceDayThree = keyboard.nextDouble();
            System.out.println("How many cups sold on day 4?");
            HowManyCupsSoldDayFour = keyboard.nextDouble();
            System.out.println("Price per cup on day 4?");
            CupSalePriceDayFour = keyboard.nextDouble();

            CupSaleTotal = HowManyCupsSoldDayOne*CupSalePriceDayOne + HowManyCupsSoldDayTwo*CupSalePriceDayTwo + HowManyCupsSoldDayThree*CupSalePriceDayThree + HowManyCupsSoldDayFour*CupSalePriceDayFour;
        }
        else if (SalesDays == 5) {
            System.out.println("How many cups sold on day 1?");
            HowManyCupsSoldDayOne = keyboard.nextDouble();
            System.out.println("Price per cup on day 1?");
            CupSalePriceDayOne = keyboard.nextDouble();
            System.out.println("How many cups sold on day 2?");
            HowManyCupsSoldDayTwo = keyboard.nextDouble();
            System.out.println("Price per cup on day 2?");
            CupSalePriceDayTwo = keyboard.nextDouble();
            System.out.println("How many cups sold on day 3?");
            HowManyCupsSoldDayThree = keyboard.nextDouble();
            System.out.println("Price per cup on day 3?");
            CupSalePriceDayThree = keyboard.nextDouble();
            System.out.println("How many cups sold on day 4?");
            HowManyCupsSoldDayFour = keyboard.nextDouble();
            System.out.println("Price per cup on day 4?");
            CupSalePriceDayFour = keyboard.nextDouble();
            System.out.println("How many cups sold on day 5?");
            HowManyCupsSoldDayFive = keyboard.nextDouble();
            System.out.println("Price per cup on day 5?");
            CupSalePriceDayFive = keyboard.nextDouble();

            CupSaleTotal = HowManyCupsSoldDayOne*CupSalePriceDayOne + HowManyCupsSoldDayTwo*CupSalePriceDayTwo + HowManyCupsSoldDayThree*CupSalePriceDayThree + HowManyCupsSoldDayFour*CupSalePriceDayFour + HowManyCupsSoldDayFive*CupSalePriceDayFive;
        }

        System.out.println("Your profit will now be calculated...");
        






    }
}
