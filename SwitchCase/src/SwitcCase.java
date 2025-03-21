import java.util.Random;

public class SwitcCase {

	public static void main(String[] args) {
		
			
		Random rand = new Random();
		int days = rand.nextInt(7);
		
		System.out.println(days);
	
			
		switch (days){
		
		case  1:
		System.out.println("monday");
		break;
		
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("thursday");
			break;
			
		case 5:
			System.out.println("friday");
			break;
			
		case 6:
			System.out.println("saturday");
			break;
			
		case 7:
			System.out.println("sunday");
			break;
			
		default:
			System.out.println("invalid day number");
			
			
			
		}

	}

}

