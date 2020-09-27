package Java_11_Constructor;

/* superclass Person */
public class Con_07_SuperCons {
	
	Con_07_SuperCons() { 
		
        System.out.println("Person class Constructor"); 
    } 

}

/* subclass Student extending the Person class */
class Student extends Con_07_SuperCons { 
	
    Student() { 
        // invoke or call parent class constructor 
        super(); //super() keyword 
  
        System.out.println("Student class Constructor"); 
    } 
} 
  
/* Driver program to test*/
class Test { 
    public static void main(String[] args) 
    { 
        Student s = new Student(); 
    } 
} 
