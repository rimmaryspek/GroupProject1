
public class ArrayGPtask5 {

	public static void main(String[] args) {
		// Create a 2D array of integers.
		// Develop a program which will calculate the sum of even and odd numbers for
		// that array.
		
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
		int[][] oddnum = { { 22, 12, 43 }, { 99, 23, 55 } };
		for (int i = 0; i < oddnum.length; i++) {
			for (int j = 0; j <oddnum[i].length; j++) {
				if (i % 2 == 0){
           
				} else if (j%2==0){ 
					sum+=oddnum[i][j];
					System.out.println("the sum of even and odd numbers is =" + sum );
					
				}
					
				}
			
		}

		
		
		
		
		
		
	}

}