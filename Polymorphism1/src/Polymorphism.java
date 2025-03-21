class Bird{

 public void sing() {
	 System.out.println("chwi chwi ");
 }
}
class Robin extends Bird{
		public void sing() {
			System.out.println("twee twee twee");
		}
	}
class pigeon extends Bird{
		public void sing() {
			System.out.println("kruu kruuu");
		}
	}
public class Polymorphism {

	public static void main(String[] args) {
		Robin r = new Robin();
		r.sing();

	}

}
