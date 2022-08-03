package p4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Sample1 {

	public static void main(String[] args) {

		Date date1 = new Date();
		System.out.println(date1);

		Date date2 = Calendar.getInstance().getTime();
		System.out.println(date2);

		LocalDate date3 = LocalDate.now();
		System.out.println(date3);

		LocalDateTime date4 = LocalDateTime.now();
		System.out.println(date4);

		ZonedDateTime date5 = ZonedDateTime.now();
		System.out.println(date5);

		System.out.println(LocalDate.of(2022, 4, 29));

		LocalDate dateOfJoin = LocalDate.of(2020, 1, 1);
		LocalDate dateOfReleave = LocalDate.now();

		System.out.println("------------------------");

		Period x = Period.between(dateOfReleave, dateOfJoin);
		System.out.println(x);
		System.out.println("Days" + x.getDays());
		System.out.println("Months" + x.getMonths());
		System.out.println("Years" + x.getYears());

	}

}
