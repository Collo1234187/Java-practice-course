import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFun {

	public static void main(String[] args) {
		//ArrayList,HashSet
		
		ArrayList<Integer> nums= new ArrayList<Integer>();

		  nums.add(4);
		  nums.add(55);
		  nums.add(45);
		  nums.add(34);
		  nums.add(23);
		  
		  Iterator<Integer> it = nums.iterator();
		  
		  while(it.hasNext()) {
			  int i = it.next();
			  if (i < 30) {
				  it.remove();
				  
			  }
		  }
		  System.out.println(nums);
	}

}
