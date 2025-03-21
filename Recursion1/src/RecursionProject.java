
public class RecursionProject {

	public static void main(String[] args) {
		
        foody(4);
	}

	public static void foody(int i) {
		if (i == 0) {
			System.out.println("done");
		}else {
			System.out.println(i);
			i--;
			foody(i);
		}
	}
	}
