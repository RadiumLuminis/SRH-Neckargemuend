package Personen;

public class Klassenraum {
	
	public static void showMoreInfo(Person person) {
		System.out.print("Mein Name ist " +person.getName() +". ");
		System.out.print("Mein Alter ist " +person.getAlter() +". ");
		System.out.println("Mein Wohnort ist " +person.getWohnort() +".");
	}
	
	public static void main(String[] args) {
		
		Person harald = new Person("Harald", 33, "Heidelberg");
		
		Schüler tom = new Schüler("Tom", 22, "Neckargemünd", 2.5);
		
		Schüler heini = new Schüler("Heini", 32, "Wiesenbach", 5.2);
		
		Lehrer schmid = new Lehrer("Schmid", 66, "München", "2298");
		
		Lehrer klein = new Lehrer("Klein", 41, "Köln", "2356");
		
		Person zusammen[] = { harald, tom, heini, schmid, klein
		};
				
		for (Person person : zusammen) {
			person.showInfo();
			if(person instanceof Schüler) {
				((Schüler) person).showSchülerInfo();
			}
			else if(person instanceof Lehrer) {
				((Lehrer) person).showLehrerInfo();
			}
			/*
			if(person.getClass().getName().equals("Personen.Schüler")) {
				((Schüler) person).showSchülerInfo();
			}
			else if (person.getClass().getName().equals("Personen.Lehrer")) {
				((Lehrer) person).showLehrerInfo();
			} */
			Klassenraum.showMoreInfo(person);
			System.out.println();
			
		}
	}
}
