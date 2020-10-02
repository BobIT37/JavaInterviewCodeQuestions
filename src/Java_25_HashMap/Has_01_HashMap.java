package Java_25_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Has_01_HashMap {

	public static void main(String[] args) {
		
	/*
	 * HashMap is a Map based collection class that is used for storing Key & value pairs, 
	 * HashMap implementation LinkedHashMap maintains the insertion order 
	 * It is similar to the Hashtable class except that 
	 * it is unsynchronized and permits nulls(null values and null key).
	 * HasTable does not allow null key
	 * 	
	 */
		
	/*
	 * It is not an ordered collection which means it does not return the keys and values 
	 * in the same order in which they have been inserted into the HashMap. 
	 * It does not sort the stored keys and Values. 	
	 */
		
		/* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");

	      /* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("Map key and values after removal:");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }


	}

}
