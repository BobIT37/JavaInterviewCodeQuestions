package Java_24_LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Link_01_AddElement {
	
	//add(), addFirst() and addLast() 
	
	public static void main(String args[]){

	     LinkedList<String> list=new LinkedList<String>();

	     //Adding elements to the Linked list
	     list.add("Steve");
	     list.add("Carl");
	     list.add("Raj");
        
	     //Adding an element to the first position
	     list.addFirst("Negan");

	     //Adding an element to the last position
	     list.addLast("Rick");

	     //Adding an element to the 3rd position
	     list.add(2, "Glenn");

	     //Iterating LinkedList
	     Iterator<String> iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }
	 } 
}
