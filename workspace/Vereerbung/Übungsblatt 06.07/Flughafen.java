public class Flughafen {

	public static void main(String[] args) {
		
		Flugzeug f1 = new Flugzeug();
		Flugzeug f2 = new Flugzeug("Lockheed", "Starfighter", 1300);
		Sportflugzeug s1 = new Sportflugzeug("Beechcraft", "Bonanza", 300, 6);
		
		System.out.println("Flugzeug f1: ");
		System.out.println("Hersteller = " + f1.getHersteller());
		System.out.println("Modell = " + f1.getModell());
		System.out.println("Höchstgeschwindigheit = " + f1.getMaxspeed() +" km/h");
		System.out.println("Ausgangsposition = " + f1.getPosition() +" km");
		f1.distanzFlug(3);
		System.out.println("Position nach erstem Flug = " +f1.getPosition() +" km");
		System.out.println();
		
		System.out.println("Flugzeug f2: ");
		System.out.println("Hersteller = " + f2.getHersteller());
		System.out.println("Modell = " + f2.getModell());
		System.out.println("Höchstgeschwindigheit = " + f2.getMaxspeed() +" km/h");
		System.out.println("Ausgangsposition = " + f2.getPosition() +" km");
		f2.distanzFlug(1);
		System.out.println("Position nach erstem Flug = " +f2.getPosition() +" km");
		System.out.println();
		
		System.out.println("Flugzeug s1: ");
		System.out.println("Hersteller = " + s1.getHersteller());
		System.out.println("Modell = " + s1.getModell());
		System.out.println("Höchstgeschwindigheit = " + s1.getMaxspeed() +" km/h");
		System.out.println("Ausgangsposition = " + s1.getPosition() +" km");
		System.out.println("Sitzplaetze = " +s1.sitzplaetze +" Sitze");
		s1.distanzFlug(2);;
		System.out.println("Position nach erstem Flug = " +s1.getPosition() +" km");
		s1.sitzplaetze = 4;
		s1.distanzFlug(1);
		System.out.println("Position nach zweitem Flug = " +s1.getPosition() +" km");
		System.out.println("Sitzplaetze nach dem zweiten Flug = " +s1.sitzplaetze +" Sitze");
		
		
		
	}
	
}
