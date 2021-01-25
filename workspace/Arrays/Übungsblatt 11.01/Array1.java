import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int [] array = new int[2]; 								//Hier: Erst Deklaration (Array anlegen = int [] array), dann Instanziierung (Größe bestimmen = new int[2])
		
		array[0] = 20;											//Hier: Initialisierung (Posotion [0] im Array bekommt den Wert 20)
		array[1] = 100;											//Hier: Initialisierung (Posotion [1] im Array bekommt den Wert 100)
		
		System.out.println("Array[0] hat den Wert: " +array[0]);
		System.out.println("Array[1] hat den Wert: " +array[1]);
		
	}

}
