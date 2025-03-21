import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Wpm {
  static String[] word= {"hello" ,"greate" ,"low" ,"height","logic" ,"ghetto" ,"ronaldo","jamaica","harrier","ghitter"};
  
	public static void main(String[] args) throws InterruptedException {
  TimeUnit.SECONDS.sleep(1);	
  System.out.println("1");
  Thread.sleep(1000);
  
  System.out.println("2");
  TimeUnit.SECONDS.sleep(1);
  
  System.out.println("3");
  TimeUnit.SECONDS.sleep(1);
  
  Random rand = new Random();
  for (int i = 0; i < word.length; i++) {
	  System.out.print(word[rand.nextInt(10)]+" ");
  }
  System.out.println();
  
  double startTime= LocalTime.now().toNanoOfDay();
  Scanner scan = new Scanner(System.in);
  String TypedWords = scan.nextLine();
  
  double endTime = LocalTime.now().toNanoOfDay();
  
  double TimeTaken= endTime - startTime;
  double seconds = TimeTaken / 1000000000.0;
  int NumChar = word.length;
  int WPM = (int)((((double)NumChar / 5) /seconds) * 60);
  System.out.println("you word per munit are:" +WPM+"wpm");
	}

}
