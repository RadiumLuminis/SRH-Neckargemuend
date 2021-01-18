
public class Array2 {

	public static void main(String[] args) {
		
		String[] namen = new String[3];				//String-Array Anlegen, Länge des Arrays manuell auf 3 setzten (Instanziierung)
		namen[0] = "Joachim K.";					//Erster Wert wird zugewiesen etc.
		namen[1] = "Marita E.";
		namen[2] = "Michael D.";
		
		for(int i = 0; i < namen.length; i++) {		//Schleife, die die Werte ausgibt
			
			System.out.println(namen[i]);
			
		}
	}

}
