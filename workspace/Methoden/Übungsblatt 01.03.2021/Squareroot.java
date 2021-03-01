import java.util.Scanner;

public class Squareroot {
	
	public static void printSqrt(long n) {
		if(n < 0) {
			System.out.println("Aus negativen Zahlen kann keine Wurzel gezogen werden!");
		}
		else {
			System.out.printf("Die Wurzel lautet: %.4f", Math.sqrt(n));
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie eine Zahl ein:");

		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		
		printSqrt(n);
		
		s.close();
	}

}
