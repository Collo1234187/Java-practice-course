package factorial01;

public class factorial03 {

	public static void main(String[] args) {
		System.out.println(factorial (5));

	}
	public static int factorial(int i) {
		if (i == 1) {
			System.out.println("factorial ("+ i +")=1");
			return 1;
		}else {
			System.out.println("factorial (" + i + ")=" + i +" * factorial (" +(i-1)+ ")");
			return i * factorial(i-1);
			
			
		}
		
	}

}
