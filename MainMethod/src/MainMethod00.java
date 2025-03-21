

public class MainMethod00 {

	public static void main(String[] args) {
	String [] s = {"hey","whatsupp","morning"};	
    SaySomething(s);
   
    if (args[0].equals("hey")) {
    	System.out.println("she is the one");
    }else if(args[0].equals("cool")) {
    	System.out.println("you are not the one");
    }
	}
	  static void SaySomething(String[] s) {
	System.out.println(s[1]);
	
	
	  }
}
