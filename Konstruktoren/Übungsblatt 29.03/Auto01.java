
public class Auto01 {

	 private String marke;
	 private char klasse;
	 private double geschwindigkeit;
	 private boolean diesel;
	 private int sitzplaetze;
	 
	 public static void main(String [] args) {
		
		 Auto01 benz1 = new Auto01();
		 
		 System.out.println("Marke:\t\t\t"+benz1.marke);
		 System.out.println("Klasse:\t\t\t"+benz1.klasse);
		 System.out.println("Sitze:\t\t\t"+benz1.sitzplaetze);
		 System.out.println("Geschwindigkeit:\t"+benz1.geschwindigkeit);
		 System.out.println("Diesel:\t\t\t"+benz1.diesel);
		 
	}
}
