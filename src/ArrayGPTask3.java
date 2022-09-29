
public class ArrayGPTask3 {

	public static void main(String[] args) {
		// 3. Create a 2D array of integer values. Print the sum of all numbers.

		int[][] numbers = { 
				{ 1, 3, 5, 16, 18 }, 
				{ 11, 105, 203, 4 }, 
				{ 6, 7, 109, 22, 57, 8445 },
				{ 45, 78, 65, 54, 1, 57895 } };
		int sum=0;
		
		
		
		for (int a = 0; a < numbers.length; a++) { // loops over rows
			for (int b = 0; b < numbers[a].length; b++) {
			System.out.print(numbers[a][b] + "  ");
			
			}}
		
		
		
		
		int sum1 = 0;

		int[][] num = { { 10, 15, 25 }, { 20, 30, 40 }

		};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++)
				sum += num[i][j];
		}
		System.out.println("The sum of the numbers is =" + sum);

	}

}
