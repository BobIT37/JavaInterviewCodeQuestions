package Java_32_Vector;

import java.util.List;
import java.util.Vector;

public class Vec_01_Vector {

	public static void main(String[] args) {
		
    //////////////Vector ///////////////////
	//Vector is synchronized 
	//It uses more memory (double the size of array)
	//Legacy class
	
	
	 List<String> values = new Vector<String>();
		
	 values.add("John");
	 values.add("Smith");
	 values.add("Jackson");
	 values.add("Bob");
	 values.add("Bob");
	 
	 for(String value : values){
	 	   System.out.println(value);
	 }
		

	}

}
