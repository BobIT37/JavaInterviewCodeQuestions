package Java_37_Regex;

import java.util.regex.Pattern;

public class Reg_01_Regex {

	public static void main(String[] args) {
		
		/*
		 * Regular expressions are used for defining String patterns that can be used for searching, 
		 * manipulating and editing a text. These expressions are also known as 
		 * Regex (short form of Regular expressions).
		 * 
		 */
		
		//In the below example, the regular expression .*book.* 
		//is used for searching the occurrence of string “book” in the text.
		
		String content = "This is Bob " +
	    "from Librarybook.com.";

      String pattern = ".*book.*";

      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("The text contains 'book'? " + isMatch); //isMatch refers Pattern.matches

	}

}
