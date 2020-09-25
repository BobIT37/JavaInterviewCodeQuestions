package Java_03_Variables;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Variable_01_VariableType {

	int c = 22; //Instance / global variable
	
	static int d = 33;
	
	public static void main(String[] args) {
		
		/*
		 * A variable is a container which holds the value while the java program is executed. 
		 * A variable is assigned with data type. 

           Three types of variables are available:

           Local Variable: It is declared in methods or blocks
           
           Instance Variable: It is declared inside the class but outside the body of the method. 
           It is called instance variable because its value is instance specific and 
           is not shared among instances.
           
           Class/Static variable: A variable that is declared as a static. 
           It cannot be a local. User can create a single copy of static variable and 
           share among all the instances of the class
           
           if method is static you cannot assign public variable in the method

		 */
		int c = 22;
	
	}
	public void variable_examples() {
		
		int a = 1; //Local Variable
		
		//static int = 2; //Cannot be defined static variable
		
		System.out.println(c); //public variable assigning
		System.out.println(d); // global Static variable assigning
	}

}
