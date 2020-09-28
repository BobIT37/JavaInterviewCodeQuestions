package Java_23_ArrayList;

import java.util.ArrayList;

public class Alist_03_RemoveElement {

	public static void main(String args[]){
		
		//remove()
		
	      ArrayList<String> alist=new ArrayList<String>(); 
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");

	      //displaying elements
	      System.out.println(alist);

	      //Removing "Steve" and "Angela"
	      alist.remove("Steve");
	      alist.remove("Angela");

	      //displaying elements
	      System.out.println(alist);

	      //Removing 3rd element
	      alist.remove(2);

	      //displaying elements
	      System.out.println(alist);
	   }

}
