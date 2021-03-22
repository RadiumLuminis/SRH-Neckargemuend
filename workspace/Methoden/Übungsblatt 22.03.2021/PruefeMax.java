import java.util.Scanner;

public class PruefeMax {

	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie eine Zahl ein:");
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		System.out.println("Bitte geben Sie eine zweite Zahl ein:");
		
		int b = sc.nextInt();
		
		System.out.println("Die größere Zahl lautet " +max(a, b));
		
		sc.close();
	}
	
	public static int max(int zahl1, int zahl2)
	{
		if(zahl1 > zahl2) {
			return(zahl1);
		}
		else {
			return(zahl2);
		}
	}
	
	static double avg( double x, double y )
	{
	return((x+y)/2);
	}

}
