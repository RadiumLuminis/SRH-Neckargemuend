
public class Konto {
	
	String inhaber;																											//Anlegen der Variablen
	
	double guthaben;
	
	double limit;
	
	Konto (String n, double gh, double l) {																					//Anlegen des Konstruktors mit 3 Parametern für inhaber (n), gutahben (gh) und limit (l)							
		inhaber = n;																										
		guthaben = gh;																										//Konstruktor weist die Werte den Variablen zu
		limit = l;
		
	}
	
	public boolean abheben (double betrag) {																				//Anlegen der Methode abheben, Rückgabewert ist boolean, es wird ein Wert (betrag) übergeben
		if (betrag < 0) {																									//Überprüfen, ob der betrag positiv ist (betrag > 0)
			return false;
		}
		else if (guthaben - betrag >= limit) 																				//Überprüfen, ob durch den betrag das limit überschritten werden würde
		{
			guthaben -= betrag;																								//Sofern das limit nich überschritten wird, soll der betrag vom guthaben abgezogen werden
			return true;																									//Die Funktion gibt dann true zurück, sprich es wurde abgehoben
		}
		else 																												//Wenn das limit überschritten würde, wird nur false zurückgegeben
		{
			return false;
		}
	}

	public static void main(String[] args) {																				//Hauptprogramm!!

		Konto bk1 = new Konto("Kost", 400, -200);																			//Erst wird durch den vorher angelegten Konstruktor eine neue Instanz des Objekttyps Konto erzeugt, mit den Parameterwerten "Kost" (inhaber), 400 (guthaben) und -200 (limit)
		
		System.out.println("Das Guthaben von Herrn/Frau " +bk1.inhaber + " beträgt vor der Abhebung: " +bk1.guthaben);		//Hier wird der inhaber und das aktuelle guthaben ausgegeben
		
		boolean erfolg;																										//Eine Variable vom Typ boolean mit dem Namen erfolg wird erzeugt
		erfolg = bk1.abheben(350);																							//Der neuen Variable wird dann das Ergebnis von der oben angelegten Methode abheben übergeben. Die Methode wird mit dem Wert 350 (betrag) aufgerufen
		
		if (erfolg)																											//Wenn die Methode abheben erfolgreich war (if (erfolg) ist kurz für: if (erfolg == true))
		{
			System.out.println("\nAbheben war erfolgreich");																//Dann wird ausgegeben, dass es erfolgreich war, zusammen mit dem inhaber und dem neuen Kontostand
			System.out.println("Das Guthaben von Herrn/Frau " +bk1.inhaber + " beträgt nach der Abhebung: " +bk1.guthaben);
		}
		else																												//Wenn die Methode nicht erfolgreich war
		{
			System.out.println("\nAbheben war nicht möglich, da das Limit von " +bk1.limit +" überschritten werden würde");	//Dann wird ausgegeben, dass es nicht erfolgreich war, mit dem kontolimit
		}
		
		erfolg = bk1.abheben(350);																							//Und hier führe ich abheben nochmal mit 350 (Euro) aus, um beide Fälle zu zeigen (erfolgreich/ nicht erfolgreich)
		
		if (erfolg)
		{
			System.out.println("\nAbheben war erfolgreich");
			System.out.println("Das Guthaben von Herrn/Frau " +bk1.inhaber + " beträgt nach der Abhebung: " +bk1.guthaben);
		}
		else
		{
			System.out.println("\nAbheben war nicht möglich, da das Limit von " +bk1.limit +" überschritten werden würde");
		}
		
	}

}
