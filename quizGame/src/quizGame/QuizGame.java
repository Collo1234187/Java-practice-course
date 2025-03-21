package quizGame;

import java.util.Random;
import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("ENTER YOUR QUESTION:");
		scan.next();
		scan.close();
		
		Random rand=new Random();
		int a=rand.nextInt(5);
		
		if (a==0) {
			System.out.println("you are the best of all people");
		}
		else if (a==1) {
			System.out.println("you requir a therapist please");
			
		}
		else if (a==2) {
			System.out.println("peter");
			
		}
		else if (a==3) {
			System.out.println("i think you should research on that");
			
		}
		else if (a==4) {
			System.out.println("can you please ask more serious questions");
			
		}
	}

}
