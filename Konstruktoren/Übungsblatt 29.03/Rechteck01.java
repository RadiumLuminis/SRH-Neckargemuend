
public class Rechteck01 {

	private int length;
	private int height;

	public Rechteck01() {

		System.out.println("Beispiel für Standardkonstruktor");
		length = 10;
		height = 20;

	}

	public static void main(String[] args) {

		Rechteck01 r1 = new Rechteck01();
		System.out.println("Wert von length: " + r1.length);
		System.out.println("Wert von heigth: " + r1.height);

	}

}
