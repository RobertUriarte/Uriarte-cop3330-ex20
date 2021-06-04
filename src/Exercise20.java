/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the order amount: ");
        double amount = scan.nextDouble();
        System.out.print("Please enter your state initial in ALL CAPITALS: ");
        scan.nextLine();
        String state = scan.nextLine();
        System.out.print("Please enter you county name: ");
        String county = scan.nextLine();

        if(state.compareTo("WI") == 0){
            double tax = .05 * amount;
            if(county.compareTo("Eau Claire") == 0){
                tax += 0.005 * amount;
                double total = tax + amount;
                System.out.printf("The tax is $%.2f\nThe total is $%.2f",tax,total);
            }
            else if(county.compareTo("Dunn") == 0){
                tax += 0.004 * amount;
                double total = tax + amount;
                System.out.printf("The tax is $%.2f\nThe total is $%.2f",tax,total);
            }
            else{
                double total = tax + amount;
                System.out.printf("The tax is $%.2f\nThe total is $%.2f",tax,total);
            }
        }
        else if(state.compareTo("IL") == 0){
            double tax = 0.08 * amount;
            double total = tax + amount;
            System.out.printf("The tax is $%.2f\nThe total is $%.2f",tax,total);
        }
        else{
            System.out.printf("The Total is $%.2f",amount);
        }

    }
}