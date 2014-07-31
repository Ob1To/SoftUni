import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CurrentDateTime {

	public static void main(String[] args) {
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
	}

}
