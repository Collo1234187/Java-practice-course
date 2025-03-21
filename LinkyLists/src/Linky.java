import java.util.Iterator;
import java.util.LinkedList;

public class Linky {

	public static void main(String[] args) {
		
		LinkedList<Integer> num = new LinkedList<Integer>();
		num.add(49);
		num.add(54);
		num.add(98);
		num.add(78);

		Iterator<Integer> it= num.iterator();
		
		while(it.hasNext()) {
			if( it.next() == 98) {
				
			System.out.println("number found");
		}else {
			System.out.println("number not found");
			
		}
	}

}
}
