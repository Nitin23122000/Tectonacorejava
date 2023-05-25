package fileHandlingexp;

import java.io.FileWriter;

public class fileWriter {

	public static void main(String[] args) {
		
		try {
			//get the object of filewriter class
			FileWriter fw=new FileWriter("nitin.txt");
			fw.write("My name is nitin prajapat");
			fw.close();
			System.out.println("written successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
