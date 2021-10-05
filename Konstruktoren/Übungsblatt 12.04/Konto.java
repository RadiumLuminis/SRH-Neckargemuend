
public class Konto {
	
	String inhaber;																											//Anlegen der Variablen
	
	double guthaben;
	
	double limit;
	
	Konto (String n, double gh, double l) {																					//Anlegen des Konstruktors mit 3 Parametern f�r inhaber (n), gutahben (gh) und limit (l)							
		inhaber = n;																										
		guthaben = gh;																										//Konstruktor weist die Werte den Variablen zu
		limit = l;
		
	}
	
	public boolean abheben (double betrag) {																				//Anlegen der Methode abheben, R�ckgabewert ist boolean, es wird ein Wert (betrag) �bergeben
		if (betrag < 0) {																									//�berpr�fen, ob der betrag positiv ist (betrag > 0)
			return false;
		}
		else if (guthaben - betrag >= limit) 																				//�berpr�fen, ob durch den betrag das limit �berschritten werden w�rde
		{
			guthaben -= betrag;																								//Sofern das limit nich �berschritten wird, soll der betrag vom guthaben abgezogen werden
			return true;																									//Die Funktion gibt dann true zur�ck, sprich es wurde abgehoben
		}
		else 																												//Wenn das limit �berschritten w�rde, wird nur false zur�ckgegeben
		{
			return false;
		}
	}

	public static void main(String[] args) {																				//Hauptprogramm!!

		Konto bk1 = new Konto("Kost", 400, -200);																			//Erst wird durch den vorher angelegten Konstruktor eine neue Instanz des Objekttyps Konto erzeugt, mit den Parameterwerten "Kost" (inhaber), 400 (guthaben) und -200 (limit)
		
		System.out.println("Das Guthaben von Herrn/Frau " +bk1.inhaber + " betr�gt vor der Abhebung: " +bk1.guthaben);		//Hier wird der inhaber und das aktuelle guthaben ausgegeben
		
		boolean erfolg;																										//Eine Variable vom Typ boolean mit dem Namen erfolg wird erzeugt
		erfolg = bk1.abheben(350);																							//Der neuen Variable wird dann das Ergebnis von der oben angelegten Methode abheben �bergeben. Die Methode wird mit dem Wert 350 (betrag) aufgerufen
		
		if (erfolg)																											//Wenn die Methode abheben erfolgreich war (if (erfolg) ist kurz f�r: if (erfolg == true))
		{
			System.out.println("\nAbheben war erfolgreich");																//Dann wird ausgegeben, dass es erfolgreich war, zusammen mit dem inhaber und dem neuen Kontostand
			System.out.println("Das Guthaben von Herrn/Frau " +bk1.inhaber + " betr�gt nach der Abhebung: " +bk1.guthaben);
		}
		else																												//Wenn die Methode nicht erfolgreich war
		{
			System.out.println("\nAbheben war nicht m�glich, da das Limit von " +bk1.limit +" �berschritten werden w�rde");	//Dann wird ausgegeben, dass es nicht erfolgreich war, mit dem kontolimit
		}
		
		erfolg = bk1.abheben(350);																							//Und hier f�hre ich abheben nochmal mit 350 (Euro) aus, um beide F�lle zu zeigen (erfolgreich/ nicht erfolgreich)
		
		if (erfolg)
		{
			System.out.println("\nAbheben war erfolgreich");
			System.out.println("Das Guthaben von Herrn/Frau " +bk1.inhaber + " betr�gt nach der Abhebung: " +bk1.guthaben);
		}
		else
		{
			System.out.println("\nAbheben war nicht m�glich, da das Limit von " +bk1.limit +" �berschritten werden w�rde");
		}
		
	}

}
