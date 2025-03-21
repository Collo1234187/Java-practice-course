package contraction;

public class Main {

	public static void main(String[] args) {
		Shirt s = new Shirt("black",32);
		
		s.getColor("white");
		s.getSize(34);
		
		System.out.println(s.color);
		System.out.println(s.size);
        
      
	}

}
