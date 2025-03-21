import java.util.ArrayList;

public class ArrayListPoject {

	public static void main(String[] args) {
		
		String [] puppies = new String [3];
		
		puppies [0] = "dean";
		puppies [1] = "odera";
		puppies [2] = "ronald";
		System.out.println(puppies [2]);
		
		
		ArrayList fruits = new ArrayList ();
		
		fruits.add("apple");
		fruits.add("mangoes");
		fruits.add("watermelone");
		fruits.add("oranges");
		fruits.remove("oranges");
		System.out.println(fruits);
	}

}
