package fileHandlingexp;

import java.io.File;

public class filedelete {

	public static void main(String[] args) {
		
		try {
		File file=new File("nitin.txt");
		if(file.delete()) {
			System.out.println("File : "+file.getName()+" deleted successfully" );
		}
		else {
			System.out.println("you got an error");
		}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
}}
