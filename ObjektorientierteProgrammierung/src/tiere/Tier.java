package tiere;

public class Tier {
	
	private static int anzahlTiere;

	private String name;
	private int alter;
	private String art;
	
	{
		anzahlTiere += 1;
	}
	
	public Tier() {
		name = "";
		alter = 0;
		art = "";
	}

	public Tier(String name, int alter, String art) {
		this.name = name;
		this.alter = alter;
		this.art = art;
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

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}
	
	public static int getAnzahlTiere() {
		return anzahlTiere;
	}
	
	public void werBistDu() {
		System.out.println("Ich bin " +name);
		System.out.println("Ich bin " +alter +" Jahre alt");
		System.out.print("Ich bin ein(e) ");
		if (art.equals("Hund")) {
			System.out.println("Hund");
			System.out.println("Wau...");
		}
		else if (art.equals("Katze")) {
			System.out.println("Katze");
			System.out.println("Miau...");
		}
		else if (art.equals("Vogel")) {
			System.out.println("Vogel");
			System.out.println("Piep...");
		}
		else {
			System.out.println("... moment, hier stimmt was nicht so ganz ...");
		}
	}
	
}
