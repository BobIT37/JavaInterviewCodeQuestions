package Java_11_Constructor;

public class Con_01_Constructor {
	
	String name;
	   //Constructor
	Con_01_Constructor(){
	      this.name = "Siliconelabs.com";
	      //The this keyword refers to the current object in a method or constructor.
	      //This can be used to refer current class instance variable.
	      //This can be used to invoke current class method (implicitly)
	      //this() can be used to invoke current class constructor

	   }

	public static void main(String[] args) {
		
		Con_01_Constructor obj = new Con_01_Constructor();
	    System.out.println(obj.name);
		
		//Constructor is a block of code that initializes the newly created object. 
		//A constructor resembles an instance method in java but 
		//it’s not a method as it doesn’t have a return type.
		//Constructor has same name as the class
		//Constructors cannot be abstract, final, static and synchronized
		//Constructor overloading is possible but overriding is not possible.
	    //If a class doesn’t have a constructor, Java compiler automatically creates 
	    //a default constructor during run-time
	    
	    /*
	     * WHY CONSTRUCTOR
	     * The purpose of constructor is to initialize the object of a class while the purpose of 
	     * a method is to perform a task by executing java code. 
	     * In other words, constructor provide memory to an object. 
	     * Without initializing an object, we can’t use its properties. 
	     */

	}

}
