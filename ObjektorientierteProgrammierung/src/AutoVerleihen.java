
public class AutoVerleihen {

	private String vin;
	private String marke;
	private String ausleiher;
	
	public AutoVerleihen(String vin) {		
		this.vin = vinprüfung(vin);
		marke = "";
		ausleiher = null;
	}
	
	public AutoVerleihen(String vin, String marke) {
		this.vin = vin;
		this.marke = marke;
		ausleiher = null;
	}
	
	private String vinprüfung(String el) {
		if ( ((int) el.charAt(4) * 3 + (int) el.charAt(5) * 2 + (int) el.charAt(6))%7 == 0 ) {
			if ( ((int) el.charAt(7) + (int) el.charAt(8) + (int) el.charAt(9)) == 11) {
				if(el.substring(0, 3) == "VIN") {
					return(el);
				}
			}	
		}
		return("");
	}
	
	public void Ausleihen(String ausleiher) {
		this.ausleiher = ausleiher;
	}
	
	public void Zurueckbekommen() {
		ausleiher = null;
	}
	
	public String toString() {
		if(ausleiher == null) {
			if (marke == null)
				return("Das Auto mit der Vin " +vin +" ist nicht verliehen.");
			else {
				return("Der " +marke +" mit der Vin " +vin +" ist nicht verliehen.");
			}
		}
		else {
			if (marke == null)
				return("Das Auto mit der Vin " +vin +" ist an den Kunden " +ausleiher);
			else {
				return("Der " +marke +" mit der Vin " +vin +" ist an den Kunden " +ausleiher);
			}
		}
	}
}
