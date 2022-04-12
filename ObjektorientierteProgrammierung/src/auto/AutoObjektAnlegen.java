package auto;

public class AutoObjektAnlegen {
	
	public static void main(String[] args) {
		
		//Objekt der Klasse Auto anlegen (Name: m4
		Auto m4 = new Auto();
		
		//Attribute von m4 setzen
		m4.farbe = "rosa";
		m4.tueren = 5;
		m4.geschwindigkeit = 1234;
		
		//Attribute ausgeben
		System.out.println("Farbe m4:\t\t" +m4.farbe);
		System.out.println("Tueren m4:\t\t" +m4.tueren);
		System.out.println("Geschwindigkeit m4:\t" +m4.geschwindigkeit);

		//Aufruf Methode zum Beschleunigen
		m4.beschleunigen();
		m4.beschleunigen();
		m4.beschleunigen();
		
		//Erneute Ausgabe der Geschwindigkeit
		System.out.println("Geschwindigkeit m4:\t" +m4.geschwindigkeit);
		
		//Aufruf Methode zum Bremsen
		m4.bremsen();
		m4.bremsen();
		m4.bremsen();
		
		//Erneute Ausgabe der Geschwindigkeit
		System.out.println("Geschwindigkeit m4:\t" +m4.geschwindigkeit);
		
		//Objekt der Klasse Auto anlegen (Name: i39n)
		Auto i39n = new Auto();
		
		//Attribute von i39n setzen
		i39n.farbe = "babyblau";
		i39n.tueren = 3;
		i39n.geschwindigkeit = 30;
		
		//Attribute ausgeben
		System.out.println("Farbe m4:\t\t" +i39n.farbe);
		System.out.println("Tueren m4:\t\t" +i39n.tueren);
		System.out.println("Geschwindigkeit m4:\t" +i39n.geschwindigkeit);
		
	}

}
