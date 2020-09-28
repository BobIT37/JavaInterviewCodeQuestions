package Java_28_HashSet;

import java.util.HashSet;

public class Has_01_HashSet {

	public static void main(String[] args) {
		
		/*
		 * It makes no guarantees as to the iteration order of the set; in particular, 
		 * it does not guarantee that the order will remain constant over time.
		 * 
		 *  It makes no guarantees as to the iteration order of the set; in particular, 
		 *  it does not guarantee that the order will remain constant over time.
		 *  HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, 
		 *  the old value would be overwritten.
		 *  HashSet allows null values however if you insert more than one nulls 
		 *  it would still return only one null value.
		 *  HashSet is non-synchronized.
		 */
		
		// HashSet declaration
	      HashSet<String> hset = 
	               new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset);
	    }

}
