import java.util.Scanner;

public class BuchstabenZähler {
	
		static int up;

	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie einen Text ein und bestätigen Sie mit Enter:");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'e' || input.charAt(i) == 'E') {
				up++;
			}
		}
		System.out.println("Der Buchstabe E kommt im Text " +up +" Mal vor");
		s.close();
	}

}
