
public class ArrayGPTask6 {

	public static void main(String[] args) {
		
		
		
		// Write a program to swap 2 numbers without a temporary variable?
        int a = 100;
        int b = 20;
        a = a + b; //a=30
        b=a-b;
        a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

		
		
		
		// Write a program to swap 2 numbers without a temporary variable?
		int c = 50;
		int v = 12;

		System.out.println("Number a is " + a + " and number b is " + b);

		a = a + b; //-> a=50+12 (62)
		b = a - b; // b=(a+b)-b -> b=62-12 (50)
		a = a - b; // a=(a+b)-a -> a=62-50 (12)

		System.out.println("If we swap a and b, the a is " + a + " and b is " + b);
	}

}
