import java.util.Arrays;

public class ArraySortiert {

	public static void main(String[] args) {
		
		String [] namen = { "Martin", "Susanne", "Cedrik", "Kevin", "Anton", "Doris" };
		
		System.out.println("Unsortierte Ausgabe: ");
		System.out.println(Arrays.toString(namen));
		
		Arrays.sort(namen);																	//Die Methode Arrays.sort() sortiert das in Klammern übergebene Array von Klein nach Groß
		System.out.println("Sortierte Ausgabe: ");
		System.out.println(Arrays.toString(namen));
		
	}

}
