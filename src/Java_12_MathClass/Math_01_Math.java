package Java_12_MathClass;

public class Math_01_Math {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		
		//How to get maximum and minimum value using Math class in Java?
		System.out.println(Math.max(x,y));
		System.out.println(Math.min(x, y));
		
		//How to get smallest and largest value of an Integer using Math class in Java?
		
		double c = 83.56;
		
		//Returns the smallest integer that is greater than or equal to the argument
		System.out.println(Math.ceil(c)); //84.0
		
		//Returns the largest integer that is less than or equal to the argument
		System.out.println(Math.floor(c)); //83
		
		//How to get power value of a variable using Math class in Java?
		//The power of a number means how many times to use the number in multiplication
		int intResult = (int) Math.pow(2, 3);
		System.out.println(intResult);
		
		//How to get square root and cube root using Math class in Java?
		//Returns the square root of x
		System.out.println(Math.sqrt(4));
		
		//To find cube root of a number
		System.out.println(Math.cbrt(2));

		

	}

}
