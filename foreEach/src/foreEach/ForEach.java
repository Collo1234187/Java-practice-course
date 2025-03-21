package foreEach;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		 numbers.add(4);
		 numbers.add(4);
		 numbers.add(4);
		 numbers.add(4);
		 numbers.add(4);
		 numbers.add(4);
		 
		 for(Integer number: numbers) {
			 System.out.println(number);
		 }
			 
			 String [] items = {"pen","pencil","rubber"};
			 
			 for (String item: items) {
				 System.out.println(item);
			 }
		 }
	}


