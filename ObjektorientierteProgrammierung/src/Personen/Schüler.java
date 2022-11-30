package Personen;

public class Schüler extends Person {
	
	private double notenschnitt;
	
	public Schüler(String name, int alter, String wohnort, double notenschnitt) {
		super(name, alter, wohnort);
		this.notenschnitt = notenschnitt;
	}
	
	public double getNotenschnitt() {
		return notenschnitt;
	}

	public void setNotenschnitt(double notenschnitt) {
		this.notenschnitt = notenschnitt;
	}

	@Override
	public void showInfo() {
		System.out.println("Ich bin ein Schüler");
	}
	
	public void showSchülerInfo()  {
		System.out.println("Ich habe einen Notenschnitt von " +getNotenschnitt());
	}
	
}
