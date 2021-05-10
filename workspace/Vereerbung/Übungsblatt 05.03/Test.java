
public class Test {

	public static void main(String[] args) {
		
		Trainer löw = new Trainer("Jogo Loew", 56, 10);
		Spieler can = new Spieler("Emre Can", 37, "Verteidiger", 33, 8, 1);
		Spieler kroos = new Spieler("Toni Kroos", 31, "Mittelfeld", 101, 3, 17);
		Torwart neuer = new Torwart("Manuel Neuer", 36, "Torwart", 98, 0, 310, 2);
		
		System.out.println("Name des Trainers: " +löw.getName() +"\nAlter des Trainers: "+löw.getAlter() +"\nErfahrung des Trainers: " +löw.getErfahrung());
		System.out.println("\nName des Spieler: " +can.getName() +"\nAlter des Spielers: "+can.getAlter() +"\nPosition des Spielers: " +can.getPosition());
		System.out.println("Motivation des Spieler: " +can.getMotivation() +"\nGeschossene Tore des Spielers: "+can.getTore());
		System.out.println("\nName des Spieler: " +kroos.getName() +"\nAlter des Spielers: "+kroos.getAlter() +"\nPosition des Spielers: " +kroos.getPosition());
		System.out.println("Motivation des Spieler: " +kroos.getMotivation() +"\nGeschossene Tore des Spielers: "+kroos.getTore());
		System.out.println("\nName des Spielers: " +neuer.getName() +"\nAlter des Spielers: "+neuer.getAlter() +"\nPositon des Spielers: " +neuer.getPosition());
		System.out.println("Reaktion des Torwarts: " +neuer.getReaktion());
	}
}
