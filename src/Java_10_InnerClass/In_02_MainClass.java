package Java_10_InnerClass;

class OuterClass3 {
	
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}


public class In_02_MainClass {

	public static void main(String[] args) {
		OuterClass3 myOuter = new OuterClass3();
	    OuterClass3.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);

	}

}
//To access the inner class, create an object of the outer class, and then create an object of the inner class:
