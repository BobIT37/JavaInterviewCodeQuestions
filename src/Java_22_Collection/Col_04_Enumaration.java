package Java_22_Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Col_04_Enumaration {

	public static void main(String[] args) {
		
		/*
		 *    Enumeration                    Iterator
            ------------------             ----------------
             hasMoreElement()                hasNext()
             nextElement()                   next()
             N/A                             remove()
		 * 
		 * In Iterator,  we can read and remove element while traversing element in the collections. 
		 * Using Enumeration, we can only read element during traversing element in the collections.
		 * Iterator can be used with any class of the collection framework.
		 * Enumeration can be used only with legacy class of the collection framework such as a Vector and HashTable.
		 * 
		 */
		
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
