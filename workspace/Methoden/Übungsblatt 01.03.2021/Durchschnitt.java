
public class Durchschnitt {
	
	public static double average(int a, int b, int c, int d) {
		
		return((double)(a+b+c+d)/4);
	}
	
	public static void main(String[] args) {
		
		int w = 55;
		int x = 20;
		int y = 10;
		int z = 44;
		
		System.out.printf("Der Durchscnitt der Werte %d, %d, %d und %d lautet %.2f", w, x, y, z, average(w, x, y, z));
	}
}
