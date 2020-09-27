package Java_14_Inheritance;

public class Inh_02_ProtectedInh {
	
	/*
	 * The child class is able to access the private members of parent class through protected 
	 * methods of parent class. When we make a instance variable(data member) or method protected, 
	 * this means that they are accessible only in the class itself and in child class. 
	 */

	   private String designation = "Teacher";
	   private String collegeName = "Beginnersbook";
	   
	   public String getDesignation() {
		return designation;
	   }
	   
	   protected void setDesignation(String designation) {
		this.designation = designation;
	   }
	   
	   protected String getCollegeName() {
		return collegeName;
	   }
	   
	   protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	   }
	   
	   void does(){
		System.out.println("Teaching");
	   }
	
}	   
	   
class JavaExample extends Inh_02_ProtectedInh{
	
	 String mainSubject = "Physics";
	 
     public static void main(String args[]){
    	 
		JavaExample obj = new JavaExample();
		/* Note: we are not accessing the data members 
		 * directly we are using public getter method 
		 * to access the private members of parent class
		 */
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
		  }
     
}
