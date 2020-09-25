package Java_05_Conditioanals;

import java.util.Scanner;

public class Con_02_Switch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int foo = scan.nextInt();
		
		switch(foo) {
		case 1:
		    System.out.println("I'm equal or greater than one");
		case 2: 
		case 3:
		    System.out.println("I'm one, two, or three");
		break; 
		default:
		}

	}

}
