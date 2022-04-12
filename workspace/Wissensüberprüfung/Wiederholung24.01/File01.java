import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File01 {

	public static void main(String[] args) throws IOException {
		
		File fileobj = new File("C:\\temp\\test.txt");
		String testText = "In the beninging";
		
		if (!fileobj.exists()) {
			fileobj.createNewFile();
		}
		
		FileWriter r1 = new FileWriter(fileobj);
		BufferedWriter br1 = new BufferedWriter(r1);
		
		br1.write(testText);
		br1.flush();
		
		br1.close();
		r1.close();
		
	}

}
