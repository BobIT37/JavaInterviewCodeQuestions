package Java_23_ArrayList;

import java.util.ArrayList;

public class Alist_02_ChangeElement {

	public static void main(String[] args) {
		
		//set()

		ArrayList<String> names = new ArrayList<String>();
	      names.add("Jim");
	      names.add("Jack");
	      names.add("Ajeet");
	      names.add("Chaitanya");
	      names.set(0, "Lucy");
	      System.out.println(names);
	   }
	

}
