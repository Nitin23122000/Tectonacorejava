package abc;

import java.util.Iterator;

public class joinMethod extends Thread {

	public void run() {
		for(int j=0; j<=5;  j++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(j);
		}
	}
	public static void main(String[] args) {
		joinMethod jm=new joinMethod();
		joinMethod jm2=new joinMethod();
		joinMethod jm3=new joinMethod();
		
		jm.start();
		try {
			jm.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		jm2.start();
		try {
			jm2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		jm3.start();
	}
}
