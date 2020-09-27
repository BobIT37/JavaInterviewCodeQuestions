package Java_16_Abstraction;

public abstract class Abs_02_Abstraction {
	
	/*
	 * Abstraction is a process of hiding implementation details and showing only functionality to the user. 
	 * In another way it shows important things to the user and hides internal details. 
	 * For instance, sending SMS where you type the text and send message. 
	 * One does not know the internal processing about the message delivery.
	 * 
	 */
	
	// An abstract class must be declared with an abstract keyword
	// public abstract class Abs_02_Abstraction{}
	
	//Variables
	int a = 10;
	static int b= 12;
	final int c = 23;
	protected int d =24;
	
	//It can have abstract and non-abstract method
	
	//Abstract Method
	abstract void sound();
	
	//regular method
	public void anotherMethod() {
		
	}
	
	//static method
	public static void extraMethod() {
		
	}
	
	//final method
	final void xLargeMethod() {
		
	}
	
	
	//CONSTRUCTOR
	public Abs_02_Abstraction() {
		
	}
	
	//It cannot be instantiated
	//Abs_02_Abstraction obj = new Abs_02_Abstraction();
	
	//regular class uses extends for abstract class
	
	

}
