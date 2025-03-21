package furtuneJava;

import java.util.Random;

public class Furtune {

	
		static String [] Furtune = {"do your part let life decide",
				                    "God first in everything we do",
				                    "life so short",
				                    "i am more than great",
				                    "do it by your self don't let them decide it for your",
				                    "they say choose wisely,maybe that's why i was chosen",
				                    "great mindset great life",
				                    "work hard lower your expectation",
				                    "never break your loyalty",
				                    "talk less listen more",
				                    "be careful with the people you walk with",
				                    "think wisely and choose wisely",
				                    "always keep it real"
				                    };

		public static void main(String[] args) {
			Random rand = new Random();
			int r = rand.nextInt(Furtune.length);
			System.out.println(Furtune[r]);
			
	}

}
