
public class StringInt {

	public static void main(String[] args) {
		
		String a = "3449";
		
		System.out.println(Integer.parseInt(a) + 4);
		
		int b = 4;
		
		System.out.println(Integer.toString(b) + 5);
		
		String s = "age: 21";
		s = s.replaceAll("\\D+","");
		
		int n = Integer.parseInt(s);
		System.out.println(n + 4);
	}

}
