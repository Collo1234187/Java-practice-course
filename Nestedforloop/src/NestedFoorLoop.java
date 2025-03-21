
public class NestedFoorLoop {

	public static void main(String[] args) {
		String [] [] color= { {"red","green","yellow"},
		                   {"blue","voilet","orange"},
		                   {"indigo","purple","gray"}
		                   };
		for (int row = 0; row<3; row++ ) {
			for (int column = 0; column < 3; column++ ) {
				System.out.println(color[row] [column]);
			}
		}

	}

}
