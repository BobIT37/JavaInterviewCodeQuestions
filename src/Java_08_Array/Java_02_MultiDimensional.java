package Java_08_Array;

public class Java_02_MultiDimensional {

	public static void main(String[] args) {
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7
		
		
		//print to dminesional array using nested loop
		 int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
		    for (int i = 0; i < myNumbers1.length; ++i) {
		      for(int j = 0; j < myNumbers1[i].length; ++j) {
		        System.out.println(myNumbers1[i][j]);
		      }
		    }

	}

}
