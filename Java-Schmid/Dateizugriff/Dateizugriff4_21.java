import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dateizugriff4_21 {

	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime.getDayOfMonth() +"." +dateTime.getMonthValue() +"." +dateTime.getYear() +" " +dateTime.getHour() +":" +dateTime.getMinute() +":" +dateTime.getSecond());
		DateTimeFormatter forma = DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(dateTime.format(forma));
		System.out.println(dateTime.getDayOfMonth() +"." +dateTime.getMonthValue() +"." +dateTime.getYear());
		forma = DateTimeFormatter.ofPattern("E");
		System.out.println(dateTime.format(forma) +" " +dateTime.getDayOfMonth() +"." +dateTime.getMonthValue());
		System.out.println("Heute ist der: " +dateTime.getDayOfMonth() +"-" + +dateTime.getMonthValue() +"-" +dateTime.getYear());
		System.out.println("Heute ist der " +dateTime.getDayOfYear() +". Tag des Jahres!");

	}

}
