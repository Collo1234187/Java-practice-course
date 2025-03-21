package contraction;

public class Shirt {

	public static String color;
	public static int size;
	
	Shirt (String color,int size){
		this.color = color;
		this.size = size;
		
	}
	
	public static void putOn() {
		System.out.println("shirt is on");
		
	}
	
	public static void putOff() {
		System.out.println("shirt is off");
		
	}
	public static void getSize(int newSize) {
		newSize = size;
	}
	public static void getColor(String newColor) {
	   newColor = color;
}
}