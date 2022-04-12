import java.util.Iterator;

public class Schleifen {

	public static void main(String[] args) {
		
		// a)
		for(int s1 = 1; s1 <= 3; s1++) {
			System.out.print(s1 + " ");
		}
		System.out.println("\n");
		
		// b)
		for(int s2 = 4; s2 >= 1; s2--) {
			System.out.print(s2 + ":");
		}
		System.out.println("\n");
		
		// c)
		for(int s3 = 2; s3 <= 12; s3 += 2) {
			System.out.print(s3 + " ");
		}
		System.out.println("\n");
		
		// d)
		int s4 = 0;
		while(s4 <= 2) {
			System.out.println("Ausgabe: " +s4);
			s4++;
		}
		System.out.println();
		
		// e)
		int s5 = 5;
		while(s5 >= 1) {
			System.out.println("Ausgabe 2: " +s5);
			s5--;
		}
		System.out.println();
		
		// f)
		int s6 = 2;
		while(s6 <= 17) {
			System.out.print(s6 + "@");
			s6 += 3;
		}

	}

}
