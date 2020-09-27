package Java_13_Static;

public class Sta_06_StaticMethod {
	
	static int i = 10;
    static String s = "Beginnersbook";
	
    //This is a static method
	public static void main(String[] args) {
		
		/*
		 * Static Methods can access class variables(static variables) without using object(instance) 
		 * of the class, however non-static methods and non-static variables can only be accessed using objects.
		 * Static methods can be accessed directly in static and non-static methods.
		 */
		
		//static method main is accessing static variables without object
		
		System.out.println("i:"+i);
	    System.out.println("s:"+s);

	}

}
