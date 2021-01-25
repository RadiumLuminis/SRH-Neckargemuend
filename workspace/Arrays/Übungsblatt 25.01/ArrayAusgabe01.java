import java.util.Arrays;

public class ArrayAusgabe01 {

	public static void main(String[] args) {
		
		String[] namen = {"Joachim K.", "Marita E.", "Michael D."};					//Array "namen" wird Deklariert und mit den Namen in den Klammern Initialisiert

		System.out.println("Die Namen lauten: ");
		System.out.println(Arrays.toString(namen));									//Wandeln des Arrays "namen" in einen String mit der .toString Methode, dann Ausgabe
		
	}

}
