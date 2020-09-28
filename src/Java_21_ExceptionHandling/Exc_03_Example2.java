package Java_21_ExceptionHandling;

public class Exc_03_Example2 {

	public static void main(String[] args) {
		
		try{
	         int a[]=new int[7];
	         a[4]=30/10;
	         System.out.println("First print statement in try block");
	     }
	     catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
	     catch(Exception e){
	        System.out.println("Warning: Some Other exception");
	     }
	   System.out.println("Out of try-catch block...");
	  }

}
