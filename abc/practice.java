package abc;

import java.util.Iterator;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Thread t=Thread.currentThread();
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(t+ " : "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

}
