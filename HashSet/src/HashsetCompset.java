import java.util.HashSet;
import java.util.Iterator;

public class HashsetCompset {

	public static void main(String[] args) {
		
		HashSet<String> hash= new HashSet<String>();
		hash.add("monkey");
		hash.add("Giraffe");
		hash.add("Lion");
		hash.add("Leopard");
		hash.add("Cheetah");
		hash.add("Chimpanzee");
		hash.add("Lizard");
		hash.add("crocodile");
	
		Iterator<String> h = hash.iterator();
		while(h.hasNext()) {
			String g =  h.next();
			System.out.println(g);
			
			if(g.equals("Lizard")) {
			   h.remove();
		}
	    
	    
		
	}
		
		System.out.println("updated list:"+hash);

}
}