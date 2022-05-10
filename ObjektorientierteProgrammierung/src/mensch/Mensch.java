package mensch;

public class Mensch {
	
	private String name;
	private int alter;
	private String wohnort;

	public Mensch() {
		this.name = "Max";
		this.alter = 0;
		this.wohnort = "Musterhausen";
	}

	public Mensch(String name, int alter, String wohnort) {
		this.name = name;
		this.alter = alter;
		this.wohnort = wohnort;
	}
	
	public void vorstellen() {
		System.out.println("Hallo ich bin " +name);
		System.out.println("Ich bin " +alter +" Jahre alt");
		System.out.println("Ich komme aus " +wohnort);
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
}
