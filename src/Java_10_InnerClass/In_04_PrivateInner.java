package Java_10_InnerClass;

class OuterClass2 {
	  int x = 10;

	  private class InnerClass {
	    int y = 5;
	  }
	}

public class In_04_PrivateInner {
	public static void main(String[] args) {
		
		OuterClass2 myOuter = new OuterClass2();
	    //OuterClass2.InnerClass myInner = myOuter.new InnerClass();
	    //System.out.println(myInner.y + myOuter.x);

	}

	//Unlike a "regular" class, an inner class can be private or protected. 
	//If you don't want outside objects to access the inner class, declare the class as private
	//If you try to access a private inner class from an outside class (MyMainClass), an error occurs
}
