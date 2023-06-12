/*
 * Author: Ahmed Hassan
 * Date: 06-12-2023
 * Assignment: Assignment 1 exercise.java
 * Description: This Java program takes user input, performs calculations
 * and outputs results based on the provided instructions.
 */
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // declare Constants
        final int some_Value = 13;
        final double DiscountRate = 7.85;
        // declare variables
        double purchasePrice, discountAmount, totalAmount;
        String itemName;
        int number1, number2, number3;


        // Input two integers
        System.out.print("Please enter the first integer: ");
        number1 = keyboard.nextInt();

        System.out.print("Please enter the second integer: ");
        number2 = keyboard.nextInt();

        //output number1 and number2
        System.out.println("\nThe value of number1 = " + number1 + " " + " and The value of number2 = " + " " + number2 + "\n");

        // Calculations
        int add = number1 + number2;
        int minus = number1 - number2;
        int divide = number1 / number2;
        int mod = number1 % number2;

        // Output calculations
        System.out.println(number1 + " " + "+" + " " + number2 + "=" + " " + add);

        System.out.println(number1 + " " + "-" + " " + number2 + "=" + " " + minus);

        System.out.println(number1 + " " + "/" + " " + number2 + "=" + " " + divide);

        System.out.println(number1 + " " + "%" + " " + number2 + "=" + " " + mod);

        // calculate number3
        number3 = ((number1 * 3) + number2);
        // Output number3
        System.out.println("\nThe value of number3 = " + number3);

        // Update number3
        number3 = number3 + some_Value;

        //output updated number3
        System.out.println("The value of number3 + SOME_VALUE = " + number3 + "\n");

        // Prompt for retail item's name
        keyboard.nextLine();
        System.out.print("Enter item name: ");
        itemName = keyboard.nextLine(); // Store input

        // Prompt for decimal number
        System.out.print("Enter purchase price as a decimal number: ");
        purchasePrice = keyboard.nextDouble(); // Store decimal number

        //Output item name
        System.out.println("\nItem Name:" + itemName);

        // Output the results
        System.out.println("Discount Rate: " + DiscountRate + "%");

        System.out.println("Item Price:  $" + purchasePrice);

        // Calculate the discount amount by multiplying the purchase price by the discount rate expressed as a decimal.
        // The discount rate is divided by 100 to convert it from a percentage to a decimal value.
        discountAmount = purchasePrice * (DiscountRate / 100);

        System.out.println("Discount Amount:  $" + discountAmount);

        // Calculate total amount
        totalAmount = purchasePrice - discountAmount;

        System.out.println("Total Amount Before Tax:  $" + totalAmount);

        // Close the scanner
        keyboard.close();


    } // end of main
} // end of class
