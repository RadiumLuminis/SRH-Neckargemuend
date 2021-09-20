import java.util.Scanner;

public class SMath {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte Geben Sie eine Zahl ein:");
		int z = s.nextInt();
		System.out.printf("Die Fakultät von %d lautet: %.0f" , z, factorial(z));
		
		s.close();
		

	}
	
	public static double factorial(int n) {
		
		double erg = 1;
		
		for(int i = n; i > 0; i--) {
			erg *= i;
		}
		
		return(erg);
	}

}
