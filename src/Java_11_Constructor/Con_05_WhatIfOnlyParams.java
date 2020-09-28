package Java_11_Constructor;

public class Con_05_WhatIfOnlyParams {
	
	private int var;
	
	//Only parameterized cons
    Con_05_WhatIfOnlyParams(int name){
          var = name; 
    }
    public int getValue()
    {
            return var;
    }

	public static void main(String[] args) {
		
		// What if you implement only parameterized constructor in class
		
		//Con_05_WhatIfOnlyParams myobj = new Con_05_WhatIfOnlyParams(); //It will throw a compilation error.
        //System.out.println("value of var is: "+myobj.getValue());
        
        //two solution
        //Remove parameters
        //put number in the constructor object

	}

}
