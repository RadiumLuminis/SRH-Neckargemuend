
public class Genesis {

	static Menschen kost = new Menschen();
	
	public static void main(String [] args) {
		
		System.out.println("Der urspr�ngliche IQ des Benutzers kost: " +kost.IQ);
		
		kost.bildung();
		
		System.out.println("Der IQ von kost nach Aufruf der ersten Methode bildung:" +kost.IQ);
		
		kost.bildung(20);
		
		System.out.println("Der IQ von kost nach Aufruf der (�berladenen) Methode bildung: " +kost.IQ);
	}
}
