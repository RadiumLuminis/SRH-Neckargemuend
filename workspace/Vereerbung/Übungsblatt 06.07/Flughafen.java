public class Flughafen {

	public static void main(String[] args) {
		
		Flugzeug f1 = new Flugzeug();
		Flugzeug f2 = new Flugzeug("Lockheed", "Starfighter", 1300);
		Sportflugzeug s1 = new Sportflugzeug("Bonanza", "Beechcraft", 300, 6);
		
		f1.distanzFlug(3);
		f2.distanzFlug(1);
		s1.distanzFlug(2);
		
		System.out.print("Das Flugzeug \"" +f1.getModell() +"\" vom Hersteller " +f1.getHersteller() +" mit einer Höchstgeschwindigheit von " +f1.getMaxspeed() +" km/h ");
		System.out.println("befindet sich an der Position " +f1.getPosition() +"\n");
		
		System.out.print("Das Flugzeug \"" +f2.getModell() +"\" vom Hersteller " +f2.getHersteller() +" mit einer Höchstgeschwindigheit von " +f2.getMaxspeed() +" km/h ");
		System.out.println("befindet sich an der Position " +f2.getPosition() +"\n");
		
		System.out.print("Das Flugzeug \"" +s1.getModell() +"\" vom Hersteller " +s1.getHersteller() +" mit einer Höchstgeschwindigheit von " +s1.getMaxspeed() +" km/h ");
		System.out.println("und " +s1.sitzplaetze +" Sitzplaetzen befindet sich an der Position " +s1.getPosition());
		
		s1.sitzplaetze = 4;
		s1.distanzFlug(1);
		
		System.out.print("Das Flugzeug \"" +s1.getModell() +"\" vom Hersteller " +s1.getHersteller() +" mit einer Höchstgeschwindigheit von " +s1.getMaxspeed() +" km/h ");
		System.out.println("und " +s1.sitzplaetze +" Sitzplaetzen befindet sich an der Position " +s1.getPosition());
	}
	
}
