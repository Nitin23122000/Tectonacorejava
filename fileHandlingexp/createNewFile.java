package fileHandlingexp;

import java.io.File;

public class createNewFile {

	public static void main(String[] args) {

		
		try {
			File file=new File("nitin.txt");
			
			if (file.createNewFile()) {
				System.out.println("the "+file.getName()+" file is created");
			}
			else {
				System.out.println("file creation is not successfully done");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
