
public class Main {

	public static void main(String[] args) {
		
	 Earpods e = new Earpods ();
	 
	 System.out.println(e.charger);
	 System.out.println(e.color);
	 System.out.println(e.model);
	 System.out.println(e.NoOfPods);
	 
	 e.bluetoothTurnOn();
	 System.out.println(e.bluetoothOn);
	 
	 e.googleTraceTurnOn();
	 System.out.println(e.googletraceOn);
	 

	}

}
