package Java_36_IO;

import java.io.File;

public class IO_05_Delete {

	public static void main(String[] args) {
		
		 try{
	         //Specify the file name and path
	    	 File file = new File("/Users/bobit/Desktop/newfile.txt");
	         /*the delete() method returns true if the file is
	          * deleted successfully else it returns false
	          */
	    	 if(file.delete()){
	    	    System.out.println(file.getName() + " is deleted!");
	         }else{
	    	    System.out.println("Delete failed: File didn't delete");
	    	  }
	       }catch(Exception e){
	           System.out.println("Exception occurred");
	    	   e.printStackTrace();
	    	}

	}

}
