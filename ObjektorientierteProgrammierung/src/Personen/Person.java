package Personen;

public class Person {
	
	private String name;
	private int alter;
	private String wohnort;
		
	public Person(String name, int alter, String wohnort) {
		this.name = name;
		this.alter = alter;
		this.wohnort = wohnort;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getWohnort() {
		return wohnort;
	}

	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}

	public void showInfo() {
		System.out.println("Ich bin eine Person");
	}

}
