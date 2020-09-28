package Java_21_ExceptionHandling;

public class Exc_04_Throw_Throws {
	
	//Throws clause is used to declare an exception, which means it works similar to the try-catch block.
	
	//Throw keyword is used in the method body to throw an exception, while throws is used in method 
	//signature to declare the exceptions that can occur in the statements present in the method.
	
	//THROW
	void myMethod() {
		   try {
		      //throwing arithmetic exception using throw
		      throw new ArithmeticException("Something went wrong!!");
		   } 
		   catch (Exception exp) {
		      System.out.println("Error: "+exp.getMessage());
		   }
		}
	
	//THROWS
	//Declaring arithmetic exception using throws
	void sample() throws ArithmeticException{
		
	   //Statements
	}

}
