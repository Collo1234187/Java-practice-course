enum level {
	LOW ,MEDIUM ,HIGH;
}

public class LetDoEnum {

	public static void main(String[] args) {
		level l = level.LOW;
		
		switch(l) {
		case LOW:
		System.out.println("LOW level");
		break;
		case MEDIUM:
			System.out.println("MEDIUM level");
			break;
		case HIGH:
			System.out.println("HIGH level");
		break;
		}
	}

}
