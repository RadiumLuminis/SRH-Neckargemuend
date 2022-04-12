import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dateizugriff4_15 {

	public static void main(String[] args) throws IOException {

		File noten = new File("c:\\temp\\Noten\\noten.txt");
		
		if (!noten.exists()) {
				noten.createNewFile();
		}
		
		double sum = 0;
		int anzahl = 0;
		
		
		FileReader reader = new FileReader(noten);
		BufferedReader bReader = new BufferedReader(reader);
		
		String tStringy = bReader.readLine();;
		
		while (tStringy != null) {
		
		if(tStringy != null) {
			String tArr[] = tStringy.split(" ");	//Alternative Lösung: Mit line.startsWith() und line.substring()
			System.out.print(tArr[1] + " ");
			sum += Double.parseDouble(tArr[1]);
			anzahl++;
		}
		
		tStringy = bReader.readLine();
		
		} 
		
		System.out.println();
		System.out.println("Der Notendurschnitt lautet: " +String.format("%.2f", (sum / anzahl)));
		
		bReader.close();
		reader.close();
	}

}
