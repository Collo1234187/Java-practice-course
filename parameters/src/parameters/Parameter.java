package parameters;

public class Parameter {

	public static void main(String[] args) {
		sayCollo();
        whoAreYou("with God everything is possible");
        ambition("collinstone",1);
        int sum1= add(44,4);
        int sum2= add(3,4);
        int sum3= add(5,4);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        
        
	}
   public static void sayCollo() {
	   System.out.println("collinstone");
   }
   public static void whoAreYou(String s) {
	   System.out.println(s);
   }
   public static void ambition(String name,int number) {
	   System.out.println("i "+name+" my ambition is to be a great programmer in the next "+number+" year");
   }
   public static int add(int a,int b) {
	   return a + b;
   }
}
