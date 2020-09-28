package Java_13_Static;

public class Sta_02_StaticBlock {
	
	static int num;
	static String mystr;
	   
	//static block
	   static{
	      num = 97;
	      mystr = "Static keyword in Java";
	   }
	   
	public static void main(String[] args) {
		
		/*
		 * Static block is used for initializing the static variables.
		 * This block gets executed when the class is loaded in the memory. 
		 * A class can have multiple Static blocks, which will execute 
		 * in the same sequence in which they have been written into the program.
		 * 
		 */
		
		System.out.println("Value of num: "+num);
	    System.out.println("Value of mystr: "+mystr);
		
		

	}

}
