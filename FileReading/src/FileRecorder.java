import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRecorder {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/Administrator/OneDrive/Desktop/captmidn.txt");
      Scanner scan = new Scanner(file);
      
      String fileContent = "";
      while(scan.hasNextLine()) {
    	 fileContent = fileContent.concat(scan.nextLine()) + "\n" ;
    	 
      }
      
      FileWriter filewriter = new FileWriter("/Users/Administrator/OneDrive/Desktop/new.txt");
     
     filewriter.write(fileContent);
     filewriter.close();
     
	}

}
