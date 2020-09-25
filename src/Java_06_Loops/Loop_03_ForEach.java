package Java_06_Loops;

import java.util.ArrayList;
import java.util.List;

public class Loop_03_ForEach {

	public static void main(String[] args) {
		
		//With Java 5 and up, one can use for-each loops, also known as enhanced for-loops:
		
		ArrayList<String> value = new ArrayList<String>();
		
		value.add("This "); 
		value.add("is "); 
		value.add("a for-each loop"); //enhanced loop
		
		for (String print : value) {
		    System.out.print(print);
		}

	}

}
