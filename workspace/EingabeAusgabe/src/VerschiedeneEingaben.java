import java.util.Scanner;

public class VerschiedeneEingaben {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie den Namen des Produktes ein:");
		String name = s.next();
		
		System.out.println("Bitte geben Sie den Preis des Produktes ein:");
		int price = s.nextInt();
		
		System.out.println("Bitte geben Sie den Rabatt auf das Produkt ein:");
		double reduction = s.nextDouble();
		

		System.out.println("Name des Produkts:\t" +name);
		System.out.println("Preis des Produkts:\t" +price);
		System.out.printf("Rabatt des Produkts:\t%.2f %%\n", reduction);
		System.out.printf("Zu Zahlen:\t\t%.2f\n" ,price * (100 - reduction) / 100);
		
		s.close();
	}

}
