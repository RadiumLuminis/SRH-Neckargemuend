
public class Skalarprodukt {

	public static void main(String[] args) {

		double[] v1 = { 2, 5, 10 };
		double[] v2 = { 3, 4, 5 };

		System.out.println("Zeilenvektor v1:");
		for (int i = 0; i < v1.length; i++) {
			System.out.print(v1[i] + "\t");
		}
		System.out.println("\n");

		System.out.println("Zeilenvektor v2:");
		for (int i = 0; i < v2.length; i++) {
			System.out.print(v2[i] + "\t");
		}
		System.out.println("\n");
		
		double skp = 0;
		System.out.println("Produktvektor:");
		for (int i = 0; i < v1.length; i++) {
			System.out.print((v2[i] * v1[i]) + "\t");
			skp += v2[i] * v1[i];
		}
		System.out.println("\n");
		
		System.out.println("Skalarprodukt:");
		System.out.printf("%.1f", skp);

	}

}
