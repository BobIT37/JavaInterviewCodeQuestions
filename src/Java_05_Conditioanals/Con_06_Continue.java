package Java_05_Conditioanals;

public class Con_06_Continue {

	public static void main(String[] args) {
		
		/*
		 * The continue keyword can be used in any of the loop control structures. 
		 * It causes the loop to immediately jump to the next iteration of the loop. 
		 * The java continue statement is used to continue the loop. 
		 * It continues the current flow of the program and skips the remaining code 
		 * at the specified condition. 
		 */
		
		String[] programmers = {"Adrian", "Paul", "John", "Harry"};
	    
		//john is not printed out
	    for (String name : programmers) { 
	    	if (name.equals("John"))
	           continue; 
	    System.out.println(name);
	}

	}

}
