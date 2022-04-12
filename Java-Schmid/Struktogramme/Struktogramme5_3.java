import java.util.Scanner;

public class Struktogramme5_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int urlaubstage = 0;
		System.out.println("Bitte geben Sie ihr Alter ein: ");
		int alter = sc.nextInt();
		System.out.println("Haben Sie einen GdB größergleich 50?: (j/n)");
		String gdb = sc.next();
		while (!gdb.equals("j") && !gdb.equals("n")) {
			System.out.println("Fehlerhafte Eingabe!");
			System.out.println("Haben Sie einen GdB größergleich 50?: (j/n)");
			gdb = sc.next();
		}
		System.out.println("Sind Sie bereits länger als 10 Jahre im Betrieb?: (j/n)");
		String betriebszeitString = sc.next();
		while (!betriebszeitString.equals("j") && !betriebszeitString.equals("n")) {
			System.out.println("Fehlerhafte Eingabe!");
			System.out.println("Haben Sie einen GdB größergleich 50?: (j/n)");
			betriebszeitString = sc.next();
		}
		if (alter > 55) {
			urlaubstage = 28;
		} 
		else if (alter < 18) {
			urlaubstage = 30;
		}
		else {
			urlaubstage = 26;
		}
		
		if (betriebszeitString.equals("j")) {
			urlaubstage += 2;
		}
		if (gdb.equals("j")) {
			urlaubstage += 5;
		}
		
		System.out.println("Sie haben Anspruch auf " +urlaubstage +" Urlaubstage");
		
		sc.close();
	}
	
}
