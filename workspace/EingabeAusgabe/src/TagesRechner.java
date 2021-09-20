import java.util.Scanner;

public class TagesRechner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Anzahl an Tagen ein:");
		int tage = s.nextInt();
		System.out.println("Dies entspricht " +(int) tage/365 +" Jahr(en) und " +tage%365 +" Tagen,");
		System.out.println("oder " +(int) tage/30 +" Monaten und " +tage%30 +" Tagen");
		s.close();

	}

}
