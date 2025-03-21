package currentTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		Date currentdate = new Date();
		System.out.println(currentdate);
		
		SimpleDateFormat   timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentdate));
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateFormat.format(currentdate));
		
		SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
		System.out.println(dayFormat.format(currentdate));
		
		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentdate));
	}
}
