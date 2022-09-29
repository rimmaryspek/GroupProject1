import java.util.Scanner;
import java.util.Arrays;

public class ArrayTaskGP1 {

	public static void main(String[] args) {
	
		/*
         * 1) Using Scanner ask the user about the size of the array create an array of
         * that size. After the array is created, fill the array with numbers, ask the numbers from the user
         * through console with the help of scanner.
         * calculate the sum of all numbers stored in above step inside the array.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];


        for(int i=0;i<size;i++) {
            System.out.println("Please Enter an int number");
            arr[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int num:arr) {
            sum+=num;
        }

        System.out.println("Sum of all the numbers from the Array is "+sum);

    }
		
		
		
		//1. Using Scanner create an array of integer values.
	// After the array is created, calculate the sum of all stored elements in that array.
		
		Scanner scan = new Scanner(System.in);
        
		//int numbers[] = new int[5];
		//int sum = 0;

		//for (int i = 0; i < numbers.length; i++) {
			//System.out.println("Please enter a number");
			//numbers[i] = scan.nextInt();
			//sum += numbers[i];
		//}
		//System.out.println("Sum of entered numbers is: " + sum);

	


}
