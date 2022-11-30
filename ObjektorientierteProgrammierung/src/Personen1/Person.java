package Personen1;

public class Person {
	
	private String vorname;
	private String nachname;
	
	public Person() {
		vorname = "Max";
		nachname = "Nachname";
	}
	
	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public void SagaNamen() {
		System.out.println("Ich heiﬂe " +vorname +" " +nachname);
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
}
