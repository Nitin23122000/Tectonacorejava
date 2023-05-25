package fileHandlingexp;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileoutputwithstring {

	public static void main(String[] args) {

	try {
		FileOutputStream foss=new FileOutputStream("prajapat.txt");
		String s="hello tectonas";
		byte b[]=s.getBytes();
		foss.write(b);
		foss.close();
		System.out.println("String written successfully...");
		
		
		FileInputStream fis=new FileInputStream("prajapat.txt");
		int i=0;
		while((i=fis.read())!=-1) {
		System.out.print((char)i);
		}
		fis.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
