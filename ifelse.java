/* Author: Ahmed Hassan
 * Date: 06-09-2023
 * Program: ifelse.java
 * Description: This program will ask the user to enter in their name and age and we will use a if statement to check
 * they are older than 18, if they are they can drink, if they are not they cannot drink.
 */
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        // this stores the input of the user
        // when the prompt is put up with the sop you should put the
        // data type name = scanner.nextLine();
Scanner keyboard = new Scanner(System.in);

// first prompt asks name
        System.out.print("Enter your first name: ");
        String first = keyboard.nextLine();
// second prompt asks last name
        System.out.print("Enter your Last name: ");
        String last = keyboard.nextLine();
// Third  prompt asks age
        System.out.print("Enter age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();

 // if thew age is less than 21 the user gets prompted that they are incorrect
        if(age < 21){
            System.out.print("Sorry, you are" + " " + age + " " + "which is under 21");
        } // end if
        // else statement that they are older than 21
        else {
            System.out.print("You are older than 21 congrats!. You can drink.");
        } // end else

    } // end of main
} // end of class
