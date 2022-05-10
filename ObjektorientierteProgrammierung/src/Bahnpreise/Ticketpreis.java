package Bahnpreise;

public class Ticketpreis {

	private boolean bahncard;
	private double ticketpreis;
	private int tageImVoraus;
	
	public Ticketpreis() {
		bahncard = false;
		ticketpreis = 0.0;
		tageImVoraus = 0;
	}
	public Ticketpreis(boolean bahncard, double ticketpreis, int tageImVoraus) {
		super();
		this.bahncard = bahncard;
		this.ticketpreis = ticketpreis;
		this.tageImVoraus = tageImVoraus;
	}
	public boolean isBahncard() {
		return bahncard;
	}
	public void setBahncard(boolean bahncard) {
		this.bahncard = bahncard;
	}
	public double getTicketpreis() {
		return ticketpreis;
	}
	public void setTicketpreis(double ticketpreis) {
		if (ticketpreis > 0) {
			this.ticketpreis = ticketpreis;
		}
		else {
			this.ticketpreis = 0;
		}
	}
	public int getTageImVoraus() {
		return tageImVoraus;
	}
	public void setTageImVoraus(int tageImVoraus) {
		this.tageImVoraus = tageImVoraus;
	}
	
	public void getRechnungsbetrag() {
		double nachlass;
		if (tageImVoraus > 14) {
			nachlass = 25;
		}
		else if (tageImVoraus > 7) {
			nachlass = 20;
		}
		else if (tageImVoraus > 0) {
			nachlass = 10;
		}
		else {
			nachlass = 0;
		}
		if (bahncard) {
			System.out.printf("Der Rechnungsbetrag lautet %.2f\n", ticketpreis * ((100 - nachlass - 25) /100));
		}
		else {
			System.out.printf("Der Rechnungsbetrag lautet %.2f\n", ticketpreis * ((100 - nachlass) /100));
		}
		
	}
	
}
