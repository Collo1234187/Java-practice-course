
 class Vehicle {

	public static void electric() {
		System.out.println("This vehicle is electric");
	}
	
	public static void vroom() {
		System.out.println("vroom vroom");
	}
	Vehicle() {
		System.out.println("vehicle constructor");
	}
}

class car extends Vehicle {
	
	car() {
		super.vroom();
		System.out.println("kruuh");
	}
}