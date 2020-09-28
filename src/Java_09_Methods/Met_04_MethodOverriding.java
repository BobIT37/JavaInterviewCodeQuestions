package Java_09_Methods;

public class Met_04_MethodOverriding {

	//Overridden method
	public void eat(){
	      System.out.println("Human is eating");
	   }
}

class Boy extends Met_04_MethodOverriding{
	
	//Overriding method
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   
	   
	   public static void main( String args[]) {
	      Boy obj = new Boy();
	      //This will call the child class version of eat()
	      obj.eat();
	   }
	   
	   //In case of overriding, method name and parameters must be same
	   //method overriding occurs in two classes that have inheritance relationship
	   //We cannot override static, final and private method in Java
	   //In method overriding , return type must be same or covariant type
	   
}
