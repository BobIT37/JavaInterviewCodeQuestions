package Java_06_Loops;

public class Loop_01_Do_While {

	public static void main(String[] args) {
		
		/*
		 * The do...while loop differs from other loops in that it is guaranteed to execute at least once. 
		 * It is also called the "post-test loop" 
		 * structure because the conditional statement is performed after the main loop body.
		 */
		
		int i = 0; 
		
		do {
			//i++;
		   System.out.println(i);
		   i++;
		
	   } 
		
		while (i < 100); // Condition gets checked AFTER the content of the loop executes.

	}

}
