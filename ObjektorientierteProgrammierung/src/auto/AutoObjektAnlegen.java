package auto;

public class AutoObjektAnlegen {
	
	public static void main(String[] args) {
		
		//Objekt der Klasse Auto anlegen (Name: m4)
		Auto m4 = new Auto();
		
		//Attribute von m4 setzen
		m4.setFarbe("rosa");
		m4.setTueren(5);;
		m4.setGeschwindigkeit(1234);
		
		//Attribute ausgeben
		System.out.println("Farbe m4:\t\t" +m4.getFarbe());
		System.out.println("Tueren m4:\t\t" +m4.getTueren());
		System.out.println("Geschwindigkeit m4:\t" +m4.getGeschwindigkeit());

		//Aufruf Methode zum Beschleunigen
		m4.beschleunigen();
		m4.beschleunigen();
		m4.beschleunigen();
		
		//Erneute Ausgabe der Geschwindigkeit
		System.out.println("Geschwindigkeit m4:\t" +m4.getGeschwindigkeit());
		
		//Aufruf Methode zum Bremsen
		m4.bremsen();
		m4.bremsen();
		m4.bremsen();
		
		//Erneute Ausgabe der Geschwindigkeit
		System.out.println("Geschwindigkeit m4:\t" +m4.getGeschwindigkeit());
		
		//Objekt der Klasse Auto anlegen (Name: i39n)
		Auto i39n = new Auto();
		
		//Attribute von i39n setzen
		i39n.setFarbe("babyblau");
		i39n.setTueren(3);
		i39n.setGeschwindigkeit(30);
		
		//Attribute ausgeben
		System.out.println("Farbe i39n:\t\t" +i39n.getFarbe());
		System.out.println("Tueren i39n:\t\t" +i39n.getTueren());
		System.out.println("Geschwindigkeit i39n:\t" +i39n.getGeschwindigkeit());
		
		//Objekt der Klasse Auto anlegen (Name: m4)
		Auto bobbyCar = new Auto();
		
		//Attribute ausgeben
		System.out.println("Farbe bobbyCar:\t\t\t" +bobbyCar.getFarbe());
		System.out.println("Tueren bobbyCar:\t\t" +bobbyCar.getTueren());
		System.out.println("Geschwindigkeit bobbyCar:\t" +bobbyCar.getGeschwindigkeit());
		
		//Objekt der Klasse Auto anlegen (Name: m4)
		Auto Tesla = new Auto("rosarot");
		
		//Attribute ausgeben
		System.out.println("Farbe Tesla:\t\t" +Tesla.getFarbe());
		System.out.println("Tueren Tesla:\t\t" +Tesla.getTueren());
		System.out.println("Geschwindigkeit Tesla:\t" +Tesla.getGeschwindigkeit());
		
		//Objekt der Klasse Auto anlegen (Name: m4)
		Auto alpina = new Auto("dunkelgrün", 7);
		
		//Attribute ausgeben
		System.out.println("Farbe alpina:\t\t" +alpina.getFarbe());
		System.out.println("Tueren alpina:\t\t" +alpina.getTueren());
		System.out.println("Geschwindigkeit alpina:\t" +alpina.getGeschwindigkeit());
		
		System.out.println();
		int anzahlAutos = Auto.getAnzahlAutos();
		System.out.println("Anzahl Autos: " +anzahlAutos);
		
	}

}
