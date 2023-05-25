package fileHandlingexp;

import java.io.FileOutputStream;

public class fileOutputStream {

	public static void main(String[] args) {
	
		try {
			FileOutputStream fout=new FileOutputStream("nitin.txt");
			fout.write(145632);
			fout.close();
			System.out.println("successfully Done...");
		} catch (Exception e) {
			System.out.println("you got AN error");
			e.printStackTrace();
		}

	}

}
