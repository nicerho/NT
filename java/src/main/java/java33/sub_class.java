package java33;

import java.text.SimpleDateFormat;
import java.util.Date;

public class sub_class {

}

class timezone {
	SimpleDateFormat date = null;

	String now_time(int call) {
		Date today = new Date();
		if (call == 1) {
			date = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		} else if (call == 2) {
			date = new SimpleDateFormat("YYYY-MM-dd");
		} else if (call == 3) {
			date = new SimpleDateFormat("HH:mm:ss");
		} 

		String result = date.format(today);
		return result;
	}
}