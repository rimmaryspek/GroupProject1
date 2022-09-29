import java.util.Scanner;

public class ArrayGPTask7 {

	public static void main(String[] args) {
		
		//7. Write a java program to check whether a given number is prime or not?
		 int num = 9;
	        boolean isPrime=true;
	        if (num > 1) {

	            for(int i=2;i<num;i++) {
	                if(num%i==0) {
	                    isPrime=false;
	                    break;
	                }
	            }
	        }else {
	            isPrime=false;
	        }

	        if(isPrime) {
	            System.out.println(num+" is Prime");
	        }else {

	            System.out.println(num+" is not Prime");
	        }

	    }
		

		
		//7. Write a java program to check whether a given number is prime or not?
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Please enter a number");
	//	integer number = scan.nextInt();
		//boolean value = false;

		

			//for (integer  i = 2; i <= number/2; i++) //condition for non-prime 
			//	{if (number % i == 0) {
				//	value = true;
				//	break;
				//}
			//}
			//if (!value) {
				//System.out.println("Entered number " + number + " is a Prime Number");
		//	} else {
				//System.out.println("Entered number " + number + " is NOT a Prime Number");
			//}
		
	}


