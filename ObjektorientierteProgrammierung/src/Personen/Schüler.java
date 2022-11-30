package Personen;

public class Sch�ler extends Person {
	
	private double notenschnitt;
	
	public Sch�ler(String name, int alter, String wohnort, double notenschnitt) {
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
		System.out.println("Ich bin ein Sch�ler");
	}
	
	public void showSch�lerInfo()  {
		System.out.println("Ich habe einen Notenschnitt von " +getNotenschnitt());
	}
	
}
