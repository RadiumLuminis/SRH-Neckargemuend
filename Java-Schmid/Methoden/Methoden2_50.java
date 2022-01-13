
public class Methoden2_50 {
	
	public static void showMenue() {
		
		System.out.println("(A)nzeigen\r\n"
				+ "(E)ingeben\r\n"
				+ "(R)echnen\r\n"
				+ "(B)eenden");
	}
	
	public static void wertAusgeben(int parameter1) {
		
		System.out.println("Der Wert lautet: "+parameter1);
		
	}

	public static void main(String[] args) {
		
		showMenue();
		wertAusgeben(123);
		
	}

}
