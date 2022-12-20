package videoaulas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClassDatas {

	public static void main(String[] args) {

		// ----- Classe Date -----

		Date today = new Date();
		System.out.println(today);

		// ----- Classe Calendar -----

		Calendar today1 = Calendar.getInstance();

		int day = today1.get(Calendar.DAY_OF_MONTH);
		int month = today1.get(Calendar.MONTH) + 1;
		int year = today1.get(Calendar.YEAR);

		System.out.printf("%d/%d/%d%n", day, month, year);
		int hours = today1.get(Calendar.HOUR);
		int minutes = today1.get(Calendar.MINUTE);
		int seconds = today1.get(Calendar.SECOND);
		System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);
		
		// ----- Formatando datas -----
		
		SimpleDateFormat dateformatting = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
		System.out.println(dateformatting.format(today1.getTime()));
		
		System.out.println(dateformatting.format(today));
	}

}
