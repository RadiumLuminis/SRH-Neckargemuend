
public class ForEach01 {

	public static void main(String[] args) {
		
		String satzString[] = {
				"Hallo" , "mein" , "Name" , "ist", ":"
		};
		
		for (String item : satzString) {
			System.out.print(item + " ");
		}
	}

}
