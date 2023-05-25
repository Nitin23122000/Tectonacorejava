package abc;

public class DaemonThread extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("DAemon Thread working...");
		}
		else {
			System.out.println("User Thread working..");
		}
	}
	
	
	public static void main(String[] args) {
		DaemonThread dt=new DaemonThread();
		DaemonThread dt2=new DaemonThread();
		dt.setDaemon(true);
		dt.start();
		dt2.start();
	}
}
