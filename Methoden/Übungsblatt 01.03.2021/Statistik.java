
public class Statistik {
	
	public static double bestimmeMaximum(double a, double b, double c) {
		if(a > b) {
			if(a > c) {
				return(a);
			}
			else {
				return(c);
			}
		}
		else {
			if(b > c) {
				return(b);
			}
			else {
				return(c);
			}
		}
	}

	public static void main(String[] args) {
		
		double a = 12;
		double b = 27;
		double c = 18;
		
		System.out.printf("Das Maximum der Zahlen %.2f, %.2f und %.2f lautet %.2f", a, b, c, bestimmeMaximum(a, b, c));

	}

}
 