
public class EnumTutorial {
	enum flavor {
		CHOCOLATE, VANILLA , STRAWBERRY;
		
		public static void getVanilla() {
			System.out.println(flavor.VANILLA);
		}
	}

	public static void main(String[] args) {
		
		
   flavor f = flavor.VANILLA;
   f.getVanilla();
   
   if (f == flavor.CHOCOLATE ) {
	   System.out.println("it chocolate");
   }else if (f == flavor.VANILLA) {
	   System.out.println("it's vanilla");
   }else 
	   System.out.println("it's strawberry");
   }
	}


