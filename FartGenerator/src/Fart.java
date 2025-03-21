import java.util.HashMap;
import java.util.Scanner;

public class Fart {

	public static void main(String[] args) {
		
		System.out.println("Enter first letter of your name \n"+"enter the number of month you were born in:");
         Scanner scan = new Scanner(System.in);
         
         String letter = scan.next().toUpperCase();
         int number = scan.nextInt();
         
         HashMap<String , String> letters = new HashMap<String , String>();
         letters.put("A", "DJLAJLDFJ");
         letters.put("B", "DJFLKAJF;LJ");
         letters.put("C", "LAJFLJDALF");
         letters.put("D", "KF;LSAJFLDJF"); 
         letters.put("E", "DJFLKDJFLA");
         letters.put("F", "KDFKJA;L");
         letters.put("G", "KDJFLKAJD");
         letters.put("H", "KJFLKDSAJL");
         letters.put("I", "KAJKDJFL");
         letters.put("G", "LKAJFLDSAJF");
         
         
         HashMap<Integer, String> numbers = new HashMap<Integer, String>();
         numbers.put(1, "KJFLDSAJ;KJ");
         numbers.put(2, "LAJJF;LA");
         numbers.put(3, "KAFJFLK");
         numbers.put(4, "SAJFLKD");
         numbers.put(5, "AJFLKDJFKDSA");
         numbers.put(6, "JALJFLDKJ");
         numbers.put(7, "LKAJFLKAJF");
         numbers.put(8, "LKASJFLKDJF");
         numbers.put(9, "LKAJFLKAJFLAKJ");
         numbers.put(10, "KAJDSLKJALKFJ");
         numbers.put(11, "JFLAJLSAJKDSJ");
         
         System.out.println("You are a "+letters.get(letter)+" "+numbers.get(number)+" fart");
         
	}

}
