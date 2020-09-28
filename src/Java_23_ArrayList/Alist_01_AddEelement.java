package Java_23_ArrayList;

import java.util.ArrayList;

public class Alist_01_AddEelement {

	public static void main(String[] args) {
		
		//add()
		 ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Steve" at the fourth position
	      alist.add(3, "Steve");
	  
	      //displaying elements
	      System.out.println(alist);
	   }  

	

}
