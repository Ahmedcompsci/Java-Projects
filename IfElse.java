package JavaBasics;
import java.util.Scanner;

public class IfElse {
	 public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	/*create a if else condition where the user gets one or the other 
	 * option based on their prompt
	 * create a scanner keyboard to store the users input.
	
	*/
	System.out.print("Enter an interger that is between 200-500:");
	int a = keyboard.nextInt();
	
	if (a < 200) {
		
		System.out.print("Please enter a valid number");
	} // end of if
	else {
		System.out.println("you have done it correctly");
	}
	
	
	
	
	 } // main
} //end
