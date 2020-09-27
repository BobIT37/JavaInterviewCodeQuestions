package Java_13_Static;

public class Sta_01_StaticKey {
	
	// This is a static method
    static void myMethod(){
    	
        System.out.println("myMethod");
    }

	public static void main(String[] args) {
		
		/*
		 * Static keyword can be used with class, variable, method and block. 
		 * Static members belong to the class instead of a specific instance, 
		 * this means if you make a member static, you can access it without object.
		 * 
		 */
		
		{
	          /* You can see that we are calling this method without creating any object. 
	           */
	           myMethod();
	    }

	}

}
