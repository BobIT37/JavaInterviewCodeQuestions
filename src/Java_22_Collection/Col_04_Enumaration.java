package Java_22_Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Col_04_Enumaration {

	public static void main(String[] args) {
		
		//Create a vector and print its contents 
		Vector vector = new Vector();
		
		for(int i = 0; i < 10; i++)
			vector.addElement(i);
		System.out.println(vector);
		
		//At beginning cursor will point to index just before the first element in vector
		Enumeration enumeration = vector.elements();
		
		//Checking the next element availability
		while (enumeration.hasMoreElements()) {
			
			//moving cursor to next element
			int i = (Integer)enumeration.nextElement();
			
			System.out.print(i+ " ");
			
		}

	}

}
