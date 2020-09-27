package Java_11_Constructor;

/* Base class Person */
public class Con_08_SuperWithMethod {
	
	void message() 
    { 
        System.out.println("This is person class"); 
    } 

}

/* Subclass Student */
class Student33 extends Con_08_SuperWithMethod 
{ 
    void message() 
    { 
        System.out.println("This is student class"); 
    } 
  
    // Note that display() is only in Student class 
    void display() 
    { 
        // will invoke or call current class message() method 
        message(); 
  
        // will invoke or call parent class message() method 
        super.message(); //Super usage with method
    } 
} 
  
/* Driver program to test */
class Test32 
{ 
    public static void main(String args[]) 
    { 
        Student33 s = new Student33(); 
  
        // calling display() of Student 
        s.display(); 
    } 
} 
