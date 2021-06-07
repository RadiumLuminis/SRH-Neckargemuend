public class Flughafen {

	public static void main(String[] args) {
		
		Flugzeug f1 = new Flugzeug();														//Anlegen der Flugzeuge f1, f2 und s1
		Flugzeug f2 = new Flugzeug("Lockheed", "Starfighter", 1300);						//Siehe Konstruktoren, einmal ohne Parameter, dann mit Name, Hersteller und Speed
		Sportflugzeug s1 = new Sportflugzeug("Beechcraft", "Bonanza", 300, 6);				//s1 ist ein Sportflugzeug und hat zusätzlich noch Sitzplätze
		
		System.out.println("Flugzeug f1: ");												//Ausgeben der Attribute vom Flugzeug f1
		System.out.println("Hersteller = " + f1.getHersteller());
		System.out.println("Modell = " + f1.getModell());
		System.out.println("Höchstgeschwindigheit = " + f1.getMaxspeed() +" km/h");
		System.out.println("Ausgangsposition = " + f1.getPosition() +" km");
		f1.distanzFlug(3);																	//Flugzeug f1 fliegt für 3 Stunden
		System.out.println("Position nach erstem Flug = " +f1.getPosition() +" km");		//Ausgeben Position danach
		System.out.println();																	//Zeilenumbruch
		
		System.out.println("Flugzeug f2: ");												//Ausgeben der Attribute vom Flugzeug f2
		System.out.println("Hersteller = " + f2.getHersteller());
		System.out.println("Modell = " + f2.getModell());
		System.out.println("Höchstgeschwindigheit = " + f2.getMaxspeed() +" km/h");
		System.out.println("Ausgangsposition = " + f2.getPosition() +" km");
		f2.distanzFlug(1);																	//Flugzeug f2 fliegt für 1 Stunde
		System.out.println("Position nach erstem Flug = " +f2.getPosition() +" km");		//Position danach
		System.out.println();
		
		System.out.println("Flugzeug s1: ");												//Ausgeben der Attribute
		System.out.println("Hersteller = " + s1.getHersteller());
		System.out.println("Modell = " + s1.getModell());
		System.out.println("Höchstgeschwindigheit = " + s1.getMaxspeed() +" km/h");
		System.out.println("Ausgangsposition = " + s1.getPosition() +" km");
		System.out.println("Sitzplaetze = " +s1.sitzplaetze +" Sitze");						//Achtung: Sitzplaetze haben die anderen net
		s1.distanzFlug(2);																	//Sportflugzeug s1 fliegt für 2 Stunden
		System.out.println("Position nach erstem Flug = " +s1.getPosition() +" km");		//Position danach
		s1.sitzplaetze = 4;																	//Ändern der Sitzplätze von s1 auf 4
		s1.distanzFlug(1);																	//Fliegt nochmal ne Stunde
		System.out.println("Position nach zweitem Flug = " +s1.getPosition() +" km");			//Position am Ende
		System.out.println("Sitzplaetze nach dem zweiten Flug = " +s1.sitzplaetze +" Sitze");	//Sitze am Ende
				
	}
	
}
