package Java_23_ArrayList;

import java.util.ArrayList;

public class Alist_04_IteratingArrayList {

	public static void main(String[] args) {
		
		//for each
		
		 ArrayList<String> alist=new ArrayList<String>();  
	     alist.add("Gregor Clegane");  
	     alist.add("Khal Drogo");  
	     alist.add("Cersei Lannister");  
	     alist.add("Sandor Clegane"); 
	     alist.add("Tyrion Lannister");
	  
	     //iterating ArrayList
	     for(String str:alist)  
	        System.out.println(str);  

	}

}
