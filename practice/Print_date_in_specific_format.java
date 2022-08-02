package practice;

import java.text.SimpleDateFormat;
import java.util.Date;


///    wrong program


public class Print_date_in_specific_format {

	public static void main(String[] args) {
		String dateformat = "mm-dd--yyyy";
		SimpleDateFormat s = new SimpleDateFormat(dateformat);
		System.out.println(s);
		String date = new String();
		System.out.println(date);

	}

}
