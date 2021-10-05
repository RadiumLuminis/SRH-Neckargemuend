
public class IfGrundlagen2 {

	public static void main(String[] args) {

		double doubleValue = 6.67;

		if (doubleValue == 0) {
			System.out.println("Der Wert ist gleich 0");
		} else {
			if (doubleValue == 5.5) {
				System.out.println("Der Wert ist gleich 5,5");
			} else {
				System.out.println("Der Wert ist weder 0 noch 5,5");
			}
		}
	}
}