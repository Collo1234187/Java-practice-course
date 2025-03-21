import java.time.LocalDate;
import java.time.Period;

public class AgeCalculate {

	public static void main(String[] args) {
		
		LocalDate currentYear = LocalDate.now();
		LocalDate birthYear = LocalDate.of(2003, 07, 27);
		
		int years = Period.between(birthYear, currentYear).getYears();
		
        System.out.println("Born in:" + birthYear);
        System.out.println();
        System.out.println("Current year:" +currentYear);
        System.out.println();
        System.out.println( years +"years old");
	}

}
