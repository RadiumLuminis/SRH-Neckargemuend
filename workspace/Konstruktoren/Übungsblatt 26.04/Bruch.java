
public class Bruch {

	public int zaehler;
	public int nenner;
	
	public void ausgeben() {
		
		System.out.println("Der Bruch lautet: " +zaehler +"/" +nenner);
	}
	
	public void ergebnis() {
		
		System.out.println("Das Ergebnis des Bruches lautet: " +(double)zaehler/ (double)nenner);
	}
	
}
