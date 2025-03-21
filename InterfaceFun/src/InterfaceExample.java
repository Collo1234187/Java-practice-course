interface BottleInterface {
	
	String color = "blue";
	int level = 100;
	
	void fillUp() ;
	void emptyUp() ;
}


public class InterfaceExample implements BottleInterface {

	public static void main(String[] args) {
		System.out.println(color);

		InterfaceExample ex = new InterfaceExample();
		ex.fillUp();
		ex.emptyUp();
	}

	public void fillUp() {
		System.out.println("it is full");
		
	}

	public void emptyUp() {
		System.out.println("it is empty");
		
	}

}
