package bbq;

import java.util.LinkedList;
import java.util.Queue;

public class bbq1 {

	public static void main(String[] args) {
		
		Queue<String> coctail = new LinkedList<String>();
		
		coctail.add("mango");
		coctail.add("ovacado");
		coctail.add("watermelon");
		coctail.add("passion");
		
		coctail.poll();
		System.out.println(coctail);
		

	}

}
