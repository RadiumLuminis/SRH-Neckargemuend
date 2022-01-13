
public class VariableArgumens {

	public static void main(String[] args) {
		
		System.out.println(summeAllerZahlen(1, 2, 3, 4));
		
		
		

	}

	public static int summeAllerZahlen(int... a) {
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			b += a[i];
		}
		return b;
	}
	
	
	
}
