
public class CharArray {

	public static void main(String[] args) {
		
		char[] c_array = {'E', 'I', 'N', ' ', 'T', 'E', 'S', 'T'};		//Legt ein Charakter-Array mit den Werten in der geschweiften Klammer an
		
		String s = new String(c_array) ;								//Macht aus dem Charakter-Array einen String
		
		System.out.println(s);											//Gibt den neuen String aus
	}

}
