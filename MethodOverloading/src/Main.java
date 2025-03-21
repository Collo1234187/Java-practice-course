import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int result1 = addNumbers(4,6);
		double result2 = addNumbers(4.44,6.23);
		int result3 = addNumbers(4,3);
		
		System.out.println(result1);
		System.out.println(result2);
		
	Main m = new Main();	
    m.addNumbers();
	}

	public static int addNumbers(int a,int b) {
		return a + b;
	}
	public static double addNumbers(double a,double b) {
		return a + b;
		
	}
	public  void addNumbers() {
		Random r = new Random();
		System.out.println(r.nextInt(5) + r.nextInt(9));
	}
}
