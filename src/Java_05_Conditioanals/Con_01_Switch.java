package Java_05_Conditioanals;

import java.util.Scanner;

public class Con_01_Switch {

	public static void main(String[] args) {
		
		/*
		 * SWITCH
		 * Switch case statement is used when we have number of options (or choices) 
		 * and we may need to perform a different task for each choice.
		 
		 * 
		 * BREAK
		 * When a break statement is encountered inside a loop, the loop is immediately 
		 * terminated and program control resumes at the next statement following loop.
           The Java break is used to break loop or switch statement. It breaks the current 
           flow of the program at specified condition. 
           In case of inner loop, it breaks only inner loop.

		 */
		
		Scanner scan = new Scanner(System.in); 
		
		int i = scan.nextInt();
		
		switch (i) {
		case 0:
		    System.out.println("i is zero"); 
		    break;
		case 1:
		    System.out.println("i is one"); 
		    break;
		case 2:
		    System.out.println("i is two"); 
		    break;
		default:
		    System.out.println("i is less than zero or greater than two");
		}

	}

}
