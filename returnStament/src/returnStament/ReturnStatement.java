package returnStament;

public class ReturnStatement {

	public static void main(String[] args) {
	String word =  caps("don't  give up and don't give in");	
	System.out.println(word);
	
	int [] ourArray = theArray (4,3,2);
	System.out.println(ourArray [0]);
	System.out.println(ourArray [1]);
	System.out.println(ourArray [2]);

	}
	
	public static String  caps (String s) {
		return s.toUpperCase();
		
	}
	
	public static int [] theArray (int a,int b,int c) {
		int [] array = new int [3];
		       array [0] = a;
		       array [1] = b;
		       array [2] = c;
		       return (array);
	}

}
