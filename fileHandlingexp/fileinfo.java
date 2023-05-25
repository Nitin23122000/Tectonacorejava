package fileHandlingexp;

import java.io.File;

public class fileinfo {
	public static void main(String[] args) {
		//create the object of file
		File fo= new File("nitin.txt");
		if(fo.exists()) {
			System.out.println("File name : "+fo.getName());
			
			System.out.println("file path : "+fo.getAbsolutePath());
			
			System.out.println("file isWritable "+fo.canWrite());
			
			System.out.println("file isReadable : "+fo.canRead());
			
			System.out.println("file Length : "+fo.length());
			
		}
	}

}
