package abc;

public class ThreadGroupDemo implements Runnable{

	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadGroupDemo runnable=new ThreadGroupDemo();
		ThreadGroup tg1=new ThreadGroup("Parent Thread");
		Thread t1=new Thread(tg1,runnable,"one");
		t1.start();
		Thread t2=new Thread(tg1,runnable,"two");
		t2.start();
		Thread t3=new Thread(tg1,runnable,"Three");
		t3.start();
		System.out.println("parent thread name : "+tg1.getName());
		
	}
	
	

}
