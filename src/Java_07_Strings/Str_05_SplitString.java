package Java_07_Strings;


public class Str_05_SplitString {

	public static void main(String[] args) {
		
		/*
		 * You can split a String on a particular delimiting character or 
		 * a Regular Expression, you can use the String.split() method 
		 */
		
		//Sample 1
		String lineFromCsvFile = "Mickey;Bolton;12345;121216";
		String[] dataCells = lineFromCsvFile.split(";");
		// Result is dataCells = { "Mickey", "Bolton", "12345", "121216"};
		
		//Sample 2
		String lineFromInput = "What do you need from me?";
		String[] words = lineFromInput.split("\\s+"); // one or more space chars 
		// Result is words = {"What", "do", "you", "need", "from", "me?"};
		
		//Sample 3
		 String[] firstNames = "Mickey, Frank, Alicia, Tom".split(", "); 
		 // Result is firstNames = {"Mickey", "Frank", "Alicia", "Tom"};

	}

}
