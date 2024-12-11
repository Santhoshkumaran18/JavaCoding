package introduction;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date d=new Date();
 		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
 		System.out.println(sdf.format(d));
		System.out.println(d.toString());
	}

}
