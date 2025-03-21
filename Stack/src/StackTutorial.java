import java.util.Stack;

public class StackTutorial {

	public static void main(String[] args) {
		
		Stack<String> gifts = new Stack<String>();
		
		gifts.add("jacket");
		gifts.add("guiter");
		gifts.add("boxer");
		gifts.add("iphone");
		
		System.out.println(gifts.peek());
		System.out.println(gifts);

	}

}
