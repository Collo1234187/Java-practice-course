import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade=scan.nextInt();
        
        if (grade >= 80 && grade <= 100 ) {
        	System.out.println("A");
        }
        else if ( grade >= 70 && grade < 80) {
        	System.out.println("B+");
        }
        else if ( grade >= 65 && grade < 70) {
        	System.out.println("B");
        }
        else if ( grade >= 60 && grade < 65) {
        	System.out.println("B-");
        }
        else if ( grade >= 50 && grade < 60) {
        	System.out.println("C+");
        }
        else if ( grade >= 40 && grade < 50) {
        	System.out.println("C");
        }
        else if ( grade >= 30 && grade < 40) {
        	System.out.println("C-");
        }
        else if ( grade >= 20 && grade < 30) {
        	System.out.println("D+");
        }
        else if ( grade >= 15 && grade < 20) {
        	System.out.println("D");
        }
        else if ( grade >= 10 && grade < 15) {
        	System.out.println("D-");
        }
        else if ( grade >= 0 && grade < 10) {
        	System.out.println("E");
        }
        else {
        	System.out.println("The grade entered is invalid");
        	
        }
	}

}
