package Java_13_Static;

public class Sta_04_StaticVariable {
	
	  static int var1;
	  static String var2;
	  
	  //This is a Static Method
	  static void disp(){
	      System.out.println("Var1 is: "+var1);
	      System.out.println("Var2 is: "+var2);
	  }

	public static void main(String[] args) {
		
     //Static variables can be accessed directly in Static method
		
		disp();

	}

}
