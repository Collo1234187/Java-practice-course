package method;

public class Method {

	public static void main(String[] args) {
		welcome();
		multiply(5,7);
		multiply(3,5);
		add(6,7);
		add(8,9);
		divide(8,9);
		divide(2,7);
		subtract(6,4);
	}
		public static void welcome() {
			System.out.println("welcome to our calculater");
			
		}
		public static void multiply(int a,int b) {
			System.out.println(a*b);
			
		}
		public static void add(double a, double b ) {
			System.out.println(a+b);
			
		}
		public static void divide (double a ,double b) {
			System.out.println(a/b );
			
		}
		public static void subtract (int a,int b) {
			System.out.println(a-b);
		}

	}


