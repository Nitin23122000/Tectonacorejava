package abc;

public class ThreadbyRunnable implements Runnable{

	public void run() {
		System.out.println(" thread is running...");
	}
	
	public static void main(String[] args) {
		ThreadbyRunnable tbr=new ThreadbyRunnable();
		Thread th=new Thread(tbr);
		th.start();
	}
	
	

}
