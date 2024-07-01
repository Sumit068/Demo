package demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Age {
	
	public static String calculateAge(String dob) {
		LocalDate birthday = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate currentDate = LocalDate.now();
		
		Period age = Period.between(birthday, currentDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		return formatter.format(birthday)+"\nYou are "+age.getYears()+" Year, "+age.getMonths()+" Months and "+age.getDays()+" Days old.";
	}

	public static void main(String[] args) {
		String str = "04/11/2000";
		System.out.println(calculateAge(str));

	}

}
