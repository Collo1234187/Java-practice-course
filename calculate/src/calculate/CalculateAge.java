package calculate;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

	public static void main(String[] args) {
         LocalDate today = LocalDate.now();
         LocalDate birthday = LocalDate.of(2003, 7, 21);
		int years= Period.between(birthday, today).getYears();
		
        System.out.println(years);

	}

}
