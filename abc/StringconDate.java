package abc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringconDate {

	public static void main(String[] args) {

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
		try {
			Date date=sdf.parse("2021/12/05");
			System.out.println("Date : "+date );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
