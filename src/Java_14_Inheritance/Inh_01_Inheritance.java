package Java_14_Inheritance;

public class Inh_01_Inheritance {
	
	//In Java, it is possible to inherit attributes and methods from one class to another.
	//There is IS-A relationship
	
	
	String designation = "Teacher";
	String collegeName = "Beginnersbook";
	
	void does(){
	 System.out.println("Teaching");
	}
	
	public class PhysicsTeacher extends Inh_01_Inheritance{
		
	}
		String mainSubject = "Physics";
		   
	public static void main(String args[]){
		   
		Inh_01_Inheritance obj = new Inh_01_Inheritance();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	}

}
