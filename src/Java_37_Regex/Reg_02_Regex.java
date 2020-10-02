package Java_37_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg_02_Regex {

	public static void main(String[] args) {
		
		/*
		 * The java.util.regex API (the package which we need to import while dealing with Regex) 
		 * has two main classes:
		 * 
		 * 1) java.util.regex.Pattern – Used for defining patterns
           2) java.util.regex.Matcher – Used for performing match operations on text using patterns
		 */
		
		// 1- java.util.regex.Pattern class:
		// 1- PATTERN MATCHES (Pattern.matches()) == CASE SENSETIVE
		
		String content = "This is a tutorial Website!";
		String patternString = ".*tutoria.*";
		boolean isMatch = Pattern.matches(patternString, content);
		System.out.println("The text contains 'tutorial'? " + isMatch);
		
		// 2- PATTERN COMPLIE (Pattern.compile()) == NO CASE SENSETIVE
		
		String content1 = "This is a Silicone Website!";
		String patternString1 = ".*sILIConelabs.";
		Pattern pattern1 = Pattern.compile(patternString1, Pattern.CASE_INSENSITIVE);
		System.out.println(pattern1);
		
		// 3- PATTERN MATCHER (Pattern.matcher()) 
		
		String content2 = "This is a tutorial Website!";
		String patternString2 = ".*tuToRiAl.*";
		Pattern pattern = Pattern.compile(patternString2, Pattern.CASE_INSENSITIVE);
		Matcher matcher1 = pattern.matcher(content2);
		boolean isMatched = matcher1.matches();
		System.out.println("Is it a Match? " + isMatched);
		
		// 4- PATTERN SPLIT (Pattern.split())
		
		// Pattern for delimiter
		String text = "ThisIsBob.ItISMyWebsite";
		String patternString4 = "is";
		Pattern pattern4 = Pattern.compile(patternString4, Pattern.CASE_INSENSITIVE);
		String[] myStrings = pattern4.split(text);
		for(String temp: myStrings){
		    System.out.println(temp);
		}
		System.out.println("Number of split strings: "+myStrings.length);

	}

}
