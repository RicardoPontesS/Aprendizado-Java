package videoaulas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ClassDatas {

	public static void main(String[] args) {
/*
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

		// ----- Fuso horário -----

		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		System.out.println(tz);
*/
		// ----- API para manipulação de datas e hora-----
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		System.out.println(LocalDate.of(2001,2,2));
		System.out.println(LocalDate.parse("2001-02-02"));
		System.out.println(date.plusDays(30));
		System.out.println(date.minusMonths(1));
		System.out.println(date.getDayOfWeek());
		System.out.println(date.isLeapYear()); // Ano bisesto
		
		LocalTime hour = LocalTime.now();
		System.out.println(hour);
		System.out.println(LocalTime.of(12, 40));
		System.out.println(LocalTime.parse("12:41:07.408163500"));
		System.out.println(hour.getHour());
		System.out.println(hour.getMinute());
		
		LocalDateTime dateandhour = LocalDateTime.now();
		System.out.println(dateandhour);
	}

}
