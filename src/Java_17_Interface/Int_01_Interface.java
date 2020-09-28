package Java_17_Interface;


public interface Int_01_Interface {
	
	/*
	 * 	Interface is a Java type definition block which 100% abstract
		All Interface methods by default public and abstract
		Static and final modifiers are not allowed for interface methods
		In interfaces variables are public, static, and final by default
		Interface cannot be instantiated, and it does not contain any constructors
		Interface can be used using “implements” keyword for a class
		A class that implements an interface must implement all the methods declared in the interface
		From interface to interface we use “extends” keyword

	 * 
	 */
	
	//Variables
	   int a=10;
	   public int b=10;
	   public static final int c=10;
	   final int d=10;
	   static int e=0;
	  
	   
	   //methods
	   
	   //Abstract method without body
	   public void sounds();
	   
	   //default
	   default void cat() {
		   
	   }
	   
	   /*
	    * Java 8 allows the interfaces to have default and static methods. 
	    * The reason we have default methods in interfaces is to allow the developers 
	    * to add new methods to the interfaces without affecting 
	    * the classes that implements these interfaces.
	    * 
	    */
	   
	   /*
	    * NO CONSTRUCTOR
	    * 
	    * public Int_01_Interface () {
		   
	       }
	    * 
	    */
	   
	   //Interface cannot be instantiated
	   //Int_01_Interface obj = new Int_01_Interface();
	   
	   
	  

}
