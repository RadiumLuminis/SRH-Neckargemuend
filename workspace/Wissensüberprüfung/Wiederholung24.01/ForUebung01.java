import java.util.ArrayList;
import java.util.Scanner;

public class ForUebung01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Zeilenanzahl ein: ");
		int zeilen = sc.nextInt();
		System.out.println("Bitte geben Sie die Spaltenanzahl ein: ");
		int spalten = sc.nextInt();
		
		for (int i = 0; i < spalten; i++) {
			
			for (int j = 0; j < zeilen; j++)  {
				System.out.print("*");
			}
			System.out.println();
		}
		
		ArrayList<String> rechteck= new ArrayList<>();
		
		for (int i = 0; i < spalten; i++) {

			String tempString = "";
			
			for (int j = 0; j < zeilen; i++) {
				tempString += "*";
			}	
			rechteck.add(tempString);
		}
		
		for (String item : rechteck) {
			System.out.println(item);
		}
		
		sc.close();
	}

}
