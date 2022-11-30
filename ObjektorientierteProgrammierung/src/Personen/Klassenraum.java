package Personen;

public class Klassenraum {
	
	public static void showMoreInfo(Person person) {
		System.out.print("Mein Name ist " +person.getName() +". ");
		System.out.print("Mein Alter ist " +person.getAlter() +". ");
		System.out.println("Mein Wohnort ist " +person.getWohnort() +".");
	}
	
	public static void main(String[] args) {
		
		Person harald = new Person("Harald", 33, "Heidelberg");
		
		Sch�ler tom = new Sch�ler("Tom", 22, "Neckargem�nd", 2.5);
		
		Sch�ler heini = new Sch�ler("Heini", 32, "Wiesenbach", 5.2);
		
		Lehrer schmid = new Lehrer("Schmid", 66, "M�nchen", "2298");
		
		Lehrer klein = new Lehrer("Klein", 41, "K�ln", "2356");
		
		Person zusammen[] = { harald, tom, heini, schmid, klein
		};
				
		for (Person person : zusammen) {
			person.showInfo();
			if(person instanceof Sch�ler) {
				((Sch�ler) person).showSch�lerInfo();
			}
			else if(person instanceof Lehrer) {
				((Lehrer) person).showLehrerInfo();
			}
			/*
			if(person.getClass().getName().equals("Personen.Sch�ler")) {
				((Sch�ler) person).showSch�lerInfo();
			}
			else if (person.getClass().getName().equals("Personen.Lehrer")) {
				((Lehrer) person).showLehrerInfo();
			} */
			Klassenraum.showMoreInfo(person);
			System.out.println();
			
		}
	}
}
