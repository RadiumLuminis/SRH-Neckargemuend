
public class VarTest2 {

    static int count = 0;
	
	public void increment() {
		count++;
	}
	
	public static void main(String[] args) {
		
		VarTest2 object1 = new VarTest2();
		VarTest2 object2 = new VarTest2();
		VarTest2 object3 = new VarTest2();

		object1.increment();
		System.out.println("Für Objekt1 hat die Variable \"count\" den Wert: " +count);
		object2.increment();
		System.out.println("Für Objekt2 hat die Variable \"count\" den Wert: " +count);
		object3.increment();
		System.out.println("Für Objekt3 hat die Variable \"count\" den Wert: " +count);
		
	}

}
