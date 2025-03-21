
public class Monkey {
	
	String type= "Spider mankey";
	
	public static void sayUHAhAh() {
		System.out.println("UhAhAhAh");
		
		
	}
	
	

	public static void main(String[] args) {
		
		Monkey m1 = new Monkey();
		Monkey m2 = new Monkey();
		Monkey m3 = new Monkey();
		
		Monkey[] monkeyyy = {m1,m2,m3};
		
		for(Monkey m : monkeyyy) {
			m.sayUHAhAh();
			
		}
		
	}

}
