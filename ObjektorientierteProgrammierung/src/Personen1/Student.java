package Personen1;

public class Student extends Person {
	
	private int matrikelnummer;
	
	public Student() {
		super();
		matrikelnummer = 0;
	}
	
	public Student(String vorname, String nachname, int matrikelnummer) {
		super(vorname, nachname);
		this.matrikelnummer = matrikelnummer;
	}
	
	public void SageNameUndMatrikelnummer() {
		System.out.println("Ich heiße " +super.getVorname() + " " +super.getNachname() +" und meine Matrikelnummer lautet " +matrikelnummer);		
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	
	
	
}
