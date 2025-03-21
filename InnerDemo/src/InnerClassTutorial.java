class outside {
	int a = 5;
	
	  class inside {
		int b = 4;
	}
}


public class InnerClassTutorial {

	public static void main(String[] args) {
		
		outside o = new outside();
		outside.inside i = o.new inside();
		 //outside.inside r = new outside.inside();
		
		System.out.println(o.a +" "+ i.b);
	}

}
