package Java_09_Methods;

public class Met_03_MethodOverloading { //Same method different parameter
	
	public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }

	public static void main(String[] args) {
		
		//Method Overloading is a feature that allows a class to have 
		//more than one method having the same name, if their argument lists are different.
		
		//In case of overloading, method name must be the same, but the parameters must be different
		//In method overloading, return type can be same or different.
		//we can overload static, final and private method in Java.

		
		Met_03_MethodOverloading obj = new Met_03_MethodOverloading();
		obj.disp('a');
	    obj.disp('a',10);

	}

}
