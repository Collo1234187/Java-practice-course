
public class TryExeption {

	public static void main(String[] args) {
		
		try {
		int[] a = null;
		System.out.println(a[-78]);
		
	}catch(NullPointerException e) {
		System.out.println("your array is null");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("the array index is out of bound");
	}catch(Exception e) {
		System.out.println("samething else went wrong");
	}
		

}
}