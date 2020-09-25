package Java_07_Strings;

public class Str_12_ReplaceMethod {

	public static void main(String[] args) {
		
		//Two ways to replace: by regex or by exact match.
		
		//Exact Match
		 String s = "popcorn"; 
		 System.out.println(s.replace('p','W'));
		 
		 String s1 = "metal petal et al."; 
		 System.out.println(s1.replace("etal","etallica"));
		 
		//Regex
		 String s3 = "spiral metal petal et al."; 
		 System.out.println(s3.replaceAll("(\\w*etal)","$1lica"));

	}

}
