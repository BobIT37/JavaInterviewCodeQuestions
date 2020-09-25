package Java_07_Strings;

public class Str_10_ToString {

	  String name;
	    int age;
	 
	    public Str_10_ToString (int age, String name) {
	        this.age = age;
	        this.name = name;
	    }
	}
	 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone{
	
		public static void main (String[] args) throws java.lang.Exception
		{
			Str_10_ToString person = new Str_10_ToString(25, "John");
			
			System.out.println(person.toString());
		}
		
		//output: Person@7ab89d
		//This is the result of the implementation of the toString() method defined in the Object class, a superclass of
		//Person. The documentation of Object.toString() states
		//returns  unsigned hexadecimal representation of the hash code of the object

}
