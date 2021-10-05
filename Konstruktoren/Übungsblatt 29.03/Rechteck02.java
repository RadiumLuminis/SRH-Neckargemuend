
public class Rechteck02 {

	private int length;
	private int height;

	public Rechteck02(int a,int b) {

		System.out.println("Beispiel für parametrisierten Konstruktor");
		length = a;
		height = b;

	}

	public static void main(String[] args) {

		Rechteck02 r1 = new Rechteck02(25, 48);
		System.out.println("Wert von length: " + r1.length);
		System.out.println("Wert von heigth: " + r1.height);
		Rechteck02 r2 = new Rechteck02(17, 51);
		System.out.println("Wert von length: " + r2.length);
		System.out.println("Wert von heigth: " + r2.height);

	}

}
