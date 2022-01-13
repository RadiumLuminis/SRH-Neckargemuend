import java.util.Scanner;

public class Methoden2_56 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte geben Sie das Startkapital ein: ");
		double kapital = sc.nextDouble();
		System.out.print("Bitte geben Sie den Zinssatz ein: ");
		int zins = sc.nextInt();
		System.out.print("Bitte geben Sie die Laufzeit in Jahren ein: ");
		int laufzeit = sc.nextInt();
		
		System.out.println(kapitalBerechnung(kapital, zins, laufzeit));
		
		sc.close();
		
	}
	
	public static double kapitalBerechnung(double k, double zins, int dauer) {
		double erg = 0;
		erg = k * Math.pow((1 + zins/100), dauer);
		
		
		return erg;
	}
}
