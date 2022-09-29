
public class ArrayGPTask10 {

	public static void main(String[] args) {
		// 10. Write a java program to find the second largest
		// number in the array?

		
		int[] numbers = { 12, 16, 58, 888, 45, 54, 1001, 00005, 9, 197 };
		int max1 = 0;
		int max2 = 0;

		for (int a = 0; a < numbers.length; a++) {
			if(max1<numbers[a]) {
				max2 = max1;
				max1=numbers[a];
			}if (max2<numbers[a] && numbers[a]<max1) {
				max2=numbers[a];
			}
				

		} System.out.println("The second largest number in the array is: " +max2);

		
		
		
		
		int[] numbers1 = { 234, 4565, 5768, 4792, 34, 78, 1, 9, 5 };
		int largest = numbers[0];
		int largest2 = numbers[0];

		for (int num : numbers) {
			if (num > largest) {
				largest = num;
			}
		}
		for (int num2 : numbers) {
			if (num2 > largest2 && num2 < largest) {
				largest2 = num2;
			}
		}
		System.out.println(largest2);

		
		
		
		
		System.out.println("----------------------");

		
		
		int[] num = { 2, 3, 4, 5, 6, 7 };
		int largersN = num[0];
		for (int i = 0; i < num.length; i++) {
			if (largersN < num[i]) {
				largersN = num[i];
				{

				}
			}
		}
		System.out.println("The largest number is = " + largersN);

	}

}
