package Java_14_Inheritance;

public class Inh_03_OverrideAndSuperKey {
	
	/* 
	 * SUPER KEYWORD
	 * It by default invokes the constructor of parent class
	 * You can use super() to call the constructor of parent.
	 * It should be the first statement in the child class
	 * constructor, you can also call the parameterized constructor
	 * of parent class by using super like this: super(10), now
	 * this will invoke the parameterized constructor of int arg
	 */
	
	//Parent class constructor
	Inh_03_OverrideAndSuperKey(){
		System.out.println("Constructor of Parent");
	}
	
	void disp(){
	  System.out.println("Parent Method");
	}
}

class JavaExample1 extends Inh_03_OverrideAndSuperKey{
		
	   public JavaExample1(){
		System.out.println("Constructor of Child");
	   }
	   
	   void disp(){
		System.out.println("Child Method");
		
	    //Calling the disp() method of parent class
		super.disp();
	   }
	   
	public static void main(String[] args){
		
		//Creating the object of child class
		JavaExample1 obj = new JavaExample1();
		obj.disp();
	   
	}
}
