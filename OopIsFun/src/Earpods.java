
public class Earpods {

	String color = "brown";
	int NoOfPods = 2;
	String model = "oraimo";
	String charger = "type c";
	
	
	String [] controls = {"fingerprint","bluetooth","googletrace"};
	
	static boolean bluetoothOn = false;
	static boolean fingerPrintPressed = false;
	static boolean googletraceOn = false;
	
	
	public static void bluetoothTurnOn() {
		bluetoothOn = true;
	}
	public static void bluetoothTurnOff() {
		bluetoothOn = false;
	}
	
	public static void googleTraceTurnOn() {
		googletraceOn = true;
	}
	
	public static void googleTraceTurnOff() {
		googletraceOn = false;
	}
	
	public static void pickCall() {
		fingerPrintPressed = true;
	}
	public static void cancleCall() {
		fingerPrintPressed = false;
	}

}
