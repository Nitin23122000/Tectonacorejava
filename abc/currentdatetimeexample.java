package abc;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class currentdatetimeexample {

	public static void main(String[] args) {
		
		DateFormat df=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		java.util.Date dobj=new java.util.Date();
		System.out.println("Simple date : "+df.format(dobj));
		
		Calendar conj=Calendar.getInstance();
		String dateandtime=df.format(conj.getTime());
		System.out.println("current date : "+dateandtime);
	}
}
