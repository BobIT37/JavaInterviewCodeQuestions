package Java_09_Methods;



public class Met_01_Methods {
	
	static void myMethod() {
	    System.out.println("I just got executed!");
	  }
	
	public void myMethod_1() {
	    System.out.println("I just got executed!");
	  }
	
	public String myMethod_2() {
	    return "I just got executed!";
	  }

	public static void main(String[] args) {
		
		/*
		 * A method is a block of code which only runs when it is called.
           You can pass data, known as parameters, into a method.
           Methods are used to perform certain actions, and they are also known as functions.
           Why use methods? To reuse code: define the code once, and use it many times.
           
		 */
		
		//Call Static Method
		myMethod();
		
		//Call void method
		Met_01_Methods obj = new Met_01_Methods();
		obj.myMethod_1();
		
		//Call non-void method
		Met_01_Methods obj1 = new Met_01_Methods();
		System.out.println(obj1.myMethod_2());

	}
	
	/*
	 * METHOD TYPES
	 * 
	 * Built-in Method (String Methods- Date & Time Methods)
	 * User Defined Methods
	 * 1- Void Method (No return type)
	 * 2- Non-Void Method (return type like String, int etc)
	 * 3- Static method
	 * 
	 */

}
