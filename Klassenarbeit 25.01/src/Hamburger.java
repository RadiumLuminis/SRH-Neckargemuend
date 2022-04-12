import java.util.Scanner;

public class Hamburger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte Gewicht in Kg eingeben: ");
		int gewicht = sc.nextInt();
		
		if(gewicht > 110) {
			System.out.println("Sie dürfen nicht teilnehmen. Sie sind zu schwer!");
		}
		else if (gewicht < 90) {
			System.out.println("Sie dürfen nicht teilnehmen. Sie sind zu leicht!");
		}
		else {
			System.out.println("Sie dürfen teilnehmen. Guten Appetit!");
		}
	}

}
