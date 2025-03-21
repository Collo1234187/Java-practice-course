import java.util.Scanner;

public class FINALLY {

	public static void main(String[] args) {
		System.out.println("ENTER A VALUE:");
		Scanner scan = new Scanner(System.in);
	try {
		int a = scan.nextInt();
		double  r = a / 4;
		
		System.out.println(r);
				
	}catch(NullPointerException e) {
		System.out.println(e);
	}catch(Exception e) {
		System.out.println(e);
	}finally {
		scan.close();
	}

}
}