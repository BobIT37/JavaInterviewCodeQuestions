package Java_08_Array;

import java.lang.reflect.Array;

public class Array_01_Array {

	public static void main(String[] args) {
		
    /*
     * Arrays are used to store multiple values in a single variable, instead of declaring separate 
     * variables for each value. Once defined, the size of an array is fixed and cannot be increased, 
     * index starts from zero to n-1
     * 
     * We can store only the fixed size of elements in the array. It does not grow its size at runtime. 
     * To solve this problem, collection framework is used in Java which grows automatically. 
     * 
     */
		//Array
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		// Outputs Volvo
		
		//Change Array value
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		cars1[0] = "Opel";
		System.out.println(cars1[0]);
		// Now outputs Opel instead of Volvo
		
		//Array Length
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars2.length);
		// Outputs 4
		
		//Array print using loop
		String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars3.length; i++) {
		  System.out.println(cars3[i]);
		}
		
		//for each loop for array
		String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars4) {
		  System.out.println(i);
		}

	}

}
