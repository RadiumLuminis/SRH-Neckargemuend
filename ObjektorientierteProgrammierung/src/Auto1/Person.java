package Auto1;

public class Person {
	
	private String name = "";
	private Auto kfz = null;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Auto getKfz() {
		return kfz;
	}

	public void setKfz(Auto kfz) {
		this.kfz = kfz;
	}
	
	public void showInfo() {
		System.out.println("Die Person heiﬂt " +name +".");
		if (kfz != null) {
			System.out.println("Sie f‰hrt ein Auto mit der Farbe " +kfz.getFarbe() +", Modell: " +kfz.getModell());
		}
		else {
			System.out.println("Sie hat kein Auto.");
		}
		
	}
	
}
