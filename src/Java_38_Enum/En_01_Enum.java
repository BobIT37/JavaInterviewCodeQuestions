package Java_38_Enum;


public class En_01_Enum {
	
	public enum Directions{
		  EAST, 
		  WEST, 
		  NORTH, 
		  SOUTH
	}
	
	Directions dir;
	
	   //constructor
	   public En_01_Enum(Directions dir) {
	      this.dir = dir;
	   }
	   
	   //Methods with switch case
	   public void getMyDirection() {
	     switch (dir) {
	       case EAST:
	          System.out.println("In East Direction");
	          break;
	                    
	       case WEST:
	          System.out.println("In West Direction");
	          break;
	                         
	       case NORTH: 
	          System.out.println("In North Direction");
	          break;
	                        
	       default:
	          System.out.println("In South Direction");
	          break;
	     }
	   }

	public static void main(String[] args) {
		
		//An enum is a special type of data type which is basically a collection (set) of constants
		//Like unchangeable variables
		
		//When you need a predefined list of values which do represent some kind of numeric 
		//or textual data, you should use an enum
		
		//Create an object
		En_01_Enum obj1 = new En_01_Enum(Directions.EAST);
	    obj1.getMyDirection();
	    En_01_Enum obj2 = new En_01_Enum(Directions.SOUTH);
	    obj2.getMyDirection();
		

	}

}
