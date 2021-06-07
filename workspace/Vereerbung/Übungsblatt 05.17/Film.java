
public class Film {

	public String titel;
	public int laenge;
	public boolean vorhanden;
	
	public Film(String t){
		
		titel = t;
		laenge = 90;
		vorhanden = true;
	}
	
	public Film(String t, int l ){
		
		titel = t; 
		laenge = l;
		vorhanden = true;
	}
	
	public Film(String t, int l, boolean v){
			
		titel = t;
		laenge = l;
		vorhanden = v;
	}
	
	public void anzeigen() {
		System.out.println("Der Titel des Films:\t" +titel);
		System.out.println("Die Länge des Films:\t" +laenge);
		System.out.println("Vorhanden:\t\t" +vorhanden);
		System.out.println();
	}

}

