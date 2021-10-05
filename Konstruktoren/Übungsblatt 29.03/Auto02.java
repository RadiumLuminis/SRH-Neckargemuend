
public class Auto02 {

	private String typ;
	public static int nr = 0;
	
	public Auto02() {
		
		System.out.println("Standartkonstruktor");
		nr++;
		typ = "EB110";
	}
	
	public Auto02(String typ) {
		
		System.out.println("Parametrisierter Konstruktor");
		nr++;
		this.typ = typ;
	}
	
	public static void main(String [] args) {
		
		Auto02 bugati1 = new Auto02();
		System.out.println("Typ: "+bugati1.typ);
		Auto02 bugati2 = new Auto02("Chiron");
		System.out.println("Typ: "+bugati2.typ);
		Auto02 bugati3 = new Auto02("Veyron");
		System.out.println("Typ: "+bugati3.typ);
		System.out.println("Es wurden "+nr +" Exemplare des Herstellers Bugatti erzeugt");
	}
	
}
