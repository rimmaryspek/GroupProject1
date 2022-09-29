
public class ArrayGPTask4 {

	public static void main(String[] args) {
		// 4.Create a 2D array or integer type where you will store odd and even
		// numbers.
		// Develop a program which will identify/print the even numbers only.

		int[][] numbers = { 
				{ 1, 3, 5, 16, 18 }, 
				{ 11, 105, 203, 4 }, 
				{ 6, 7, 109, 22, 57, 8445 },
				{ 45, 78, 65, 54, 1, 57895 } };

		for (int a = 0; a < numbers.length; a++) { 

			for (int b = 0; b < numbers[a].length; b++) {

				if (numbers[a][b] % 2 == 0) {
					System.out.print(numbers[a][b] + "  ");
				}
			}
		}
		
		
	
		
		
		
		int sum = 0;
		int[][] myArray = { { 23, 93, 56, 92, 45, 88, 44, 77 }, { 55, 33, 21, 66, 96 }, };

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {

				if ((myArray[i][j] %= 2) == 0) {

				}

				System.out.println(myArray[i]);

			}
			System.out.println("Even numbers in the given array are: ");
		}

	}

}