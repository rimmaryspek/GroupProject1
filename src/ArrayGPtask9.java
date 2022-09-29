
public class ArrayGPtask9 {

	public static void main(String[] args) {
		
		    //9 Maximum and minimum number in the array?

		int[] numbers = { 12, 16, 58, 888, 45, 54, 1001, 00005, 9, 197 };
		int max = numbers[0];
		
		{
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > max)
					max = numbers[i];
			}
			System.out.println("The maximum number is: " + max);

		} for (int a = numbers.length-1; a >=0 ; a--) {
			if (numbers[a] < max)
				max = numbers[a];
		}
		System.out.println("The maximum number is: " + max);
		

		
		
		int[] numbers1= {345,123,78,6789,9,1,2,34};
        int largest= numbers [0];
        for (int finalnum:numbers) {
            if(finalnum>largest) {
                largest=finalnum;
            }
        } System.out.println("The largest number is "+ largest);
        System.out.println("-----------------------");

        int smallest= numbers [0];
        for (int number:numbers) {
            if (number<smallest) {
                smallest=number;
            }
        } System.out.println("The smallest number is "+smallest);          
		        
}

	}

