package forLoopStar;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		System.out.println("Enter your number?");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		
		for(int i = 1;i <= number;i++) {
		   for(int j = 0; j < i;j++) {
			   
			   System.out.print("*");
			   
		   }
		   
     System.out.println();
	}
		for (int i = number - 1;i > 0;i--) {
			for (int j = 0; j < i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

}
}