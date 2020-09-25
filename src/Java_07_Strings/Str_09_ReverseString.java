package Java_07_Strings;

public class Str_09_ReverseString {

	public static void main(String[] args) {
		
		//StringBuilder/StringBuffer
		
		String code = "code"; 
		System.out.println(code);
		
		StringBuilder sb = new StringBuilder(code); 
		code = sb.reverse().toString();
		System.out.println(code);
		
		//Char Array
		
		char[] array = code.toCharArray();
		for (int index = 0, mirroredIndex = array.length - 1; index < mirroredIndex; mirroredIndex--) {
		   char temp = array[index]; 
		    array[index] = array[mirroredIndex]; 
		    array[mirroredIndex] = temp;
		}
		
		// print reversed
		System.out.println(new String(array));

	}

}
