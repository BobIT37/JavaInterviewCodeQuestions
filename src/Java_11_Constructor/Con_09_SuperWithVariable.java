package Java_11_Constructor;

public class Con_09_SuperWithVariable {
	
	int maxSpeed = 120; 

}

/* sub class Car extending vehicle */
class Car extends Con_09_SuperWithVariable 
{ 
    int maxSpeed = 180; 
  
    void display() 
    { 
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed); //variable super output 120
    } 
} 
  
/* Driver program to test */
class Test33 
{ 
    public static void main(String[] args) 
    { 
        Car small = new Car(); 
        small.display(); 
    } 
} 