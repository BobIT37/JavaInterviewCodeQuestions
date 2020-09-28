package Java_11_Constructor;

public class Con_04_ParameterizedCons {
	
	int empId;  
	String empName;  
		    
	   //parameterized constructor with two parameters
	   Con_04_ParameterizedCons(int id, String name){  
	       this.empId = id;  
	       this.empName = name;  
	   }  
	   void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   }  

	public static void main(String[] args) {
		
		// Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
		
		Con_04_ParameterizedCons obj1 = new Con_04_ParameterizedCons(10245,"Chaitanya");  
		Con_04_ParameterizedCons obj2 = new Con_04_ParameterizedCons(92232,"Negan");  
		obj1.info();  
		obj2.info();

	}

}
