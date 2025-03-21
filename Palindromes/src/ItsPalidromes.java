
public class ItsPalidromes {

	public static void main(String[] args) {
		String original = "race car";
		original = original.replace(" " ,"");
		
		String reverse = "";
		for (int i = original.length() - 1;i >= 0;i--) {
		reverse += original.charAt(i);
		System.out.println(reverse);
		}
    boolean palidromes = true;
    for (int i = 0;i < original.length();i++) {
    	if (original.charAt(i) != reverse.charAt(i)) {
    		palidromes = false;
    		
    	}
    }
    if (palidromes) {
    	System.out.println("it is a palindrome");
    	
    }else {
    	System.out.println("not a palidrome");
    }
    
	}

}
