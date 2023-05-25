package abc;



public class Threadexp extends Thread {

	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
public static void main(String[] args) {
	Threadexp tep=new Threadexp();
	Threadexp tep2=new Threadexp();
	tep.start();
	tep2.start();
}
}
