package abc;


public class ThreadState  extends Thread{

	public void run() {
		System.out.println("Thread is running.....");
	}
	public static void main(String[] args) {
		ThreadState ts=new ThreadState();
		ts.start();
	}
}
