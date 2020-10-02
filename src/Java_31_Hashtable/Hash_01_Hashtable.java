package Java_31_Hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_01_Hashtable {
	
	//HashMap and Hashtable both classes implements java.util.Map interface.
	
	//HashMap is non-synchronized. This means if it’s used in multi-thread environment 
	//then more than one thread can access and process the HashMap simultaneously.
	
	//Hashtable is synchronized. It ensures that no more than one thread can 
	//access the Hashtable at a given moment of time. 
	
	//HashMap allows one null key and any number of null values.
	//Hashtable doesn’t allow null keys and null values.
	
	//HashMap implementation LinkedHashMap maintains the insertion order
	//Hashtable doesn’t guarantee any kind of order. It doesn’t maintain the mappings in any particular order.
	
	public static void main(String[] args) {
		 
		   Enumeration names;
		   String key;
		 
		   // Creating a Hashtable
		   Hashtable<String, String> hashtable = 
		              new Hashtable<String, String>();
		 
		   // Adding Key and Value pairs to Hashtable
		   hashtable.put("Key1","Chaitanya");
		   hashtable.put("Key2","Ajeet");
		   hashtable.put("Key3","Peter");
		   hashtable.put("Key4","Ricky");
		   hashtable.put("Key5","Mona");
		 
		   names = hashtable.keys();
		   while(names.hasMoreElements()) {
		      key = (String) names.nextElement();
		      System.out.println("Key: " +key+ " & Value: " +
		      hashtable.get(key));
		   }
		 }
	

}
