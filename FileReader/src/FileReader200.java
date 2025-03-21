import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader200 {

	public static void main(String[] args) throws IOException {
		File file = new File("\\Users\\Administrator\\OneDrive\\Desktop\\captmidn.txt");
       Scanner scan = new Scanner(file);
       
       String filecontent = "";
       while (scan.hasNextLine()) {
       filecontent = filecontent.concat(scan.nextLine() + "\n");
       
       
	}
       FileWriter writer= new FileWriter("\\Users\\Administrator\\OneDrive\\Desktop\\new");
       writer.write(filecontent);
       writer.close();
}
}