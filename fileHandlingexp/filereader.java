package fileHandlingexp;

import java.io.File;
import java.util.Scanner;

public class filereader {

	public static void main(String[] args) {
		try {
			File f1=new File("nitin.txt");
			
			Scanner scn=new Scanner(f1);
			while(scn.hasNextLine()) {
				String data =scn.nextLine();
				System.out.println("data : "+data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
