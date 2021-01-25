import java.util.Arrays;

public class ByteArray {

	public static void main(String[] args) {
		
		byte [] b = {69, 73, 78, 32, 84, 69, 83, 84};							//Byte Array mit dem Namen "b" deklarieren und initialisieren
		
		System.out.println("Byte-Array als Zahlen");
		System.out.println(Arrays.toString(b));									//Normale Ausgabe des Byte-Arrays per .toString
		
		String t = new String(b);												//Typkonvertierung des Byte-Arrays zu einem String
		System.out.println("\nByte Array per Typconvertierung:");
		System.out.println(t);													//Ausgabe des Stringss
	}

}
