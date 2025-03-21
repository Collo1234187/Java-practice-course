import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		
			int a = 2;
			 while (a < 10) {
			 System.out.println(a);
			 a++;
		}
			int b = 3;
			
			do {
				System.out.println(b);
			}while (b==6) ;
			
	     String sentence = "we are still trying to make it in life";
	     Scanner scan = new Scanner(sentence);
	      ArrayList word = new ArrayList();
	      
	     while (scan.hasNext()) {
	    	 word.add(scan.next());
	     }
	     System.out.println(word);
			}



	}
