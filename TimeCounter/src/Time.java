import java.util.Scanner;

public class Time {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("3");
		
	Thread.sleep(1000);
		System.out.println("Go!!!");
		
		long StartTime = System.currentTimeMillis();
		
		Scanner scan = new Scanner(System.in);
		scan.next();
		
		long EndTime = System.currentTimeMillis();
		
		long Duration = EndTime - StartTime;
		
		System.out.println(Duration + " ms");
		
	}
}
