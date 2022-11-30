package Personen1;

public class Professor extends Person{
	
	private double gehalt;

	public Professor() {
		super();
		gehalt = 0;
	}

	public Professor(String vorname, String nachname, double gehalt) {
		super(vorname, nachname);
		this.gehalt = gehalt;
	}

	public void SageNameUndGehalt() {
		System.out.println("Ich heiﬂe " +super.getVorname() +" " +super.getNachname() +" und ich verdiene " +gehalt +" Euro.");
	}
	
}
