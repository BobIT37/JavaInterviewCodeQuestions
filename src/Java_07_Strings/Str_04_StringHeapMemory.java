package Java_07_Strings;

public class Str_04_StringHeapMemory {

	public static void main(String[] args) {
		
		
		/*
		 * Like many Java objects, all String instances are created on the heap, even literals. 
		 * When the JVM finds a String literal that has no equivalent reference in the heap, 
		 * the JVM creates a corresponding String instance on the heap and it also stores a reference 
		 * to the newly created String instance in the String pool. Any other references to the same 
		 * String literal are replaced with the previously created String instance in the heap.
		 */
		
		String a = "alpha";
		String b = "alpha";
		String c = new String("alpha");
		
		//All three strings are equivalent
		System.out.println(a.equals(b) && b.equals(c));
		
		//Although only a and b reference the same heap object
		System.out.println(a == b); 
		System.out.println(a != c); 
		System.out.println(b != c);

	}

}
