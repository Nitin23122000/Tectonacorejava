package abc;

public class MyThread2 implements Runnable{

	
	public void run() {
		System.out.println("Now the Thread is running...");
	}
	
	public static void main(String[] args) {
		MyThread2 th2=new MyThread2();
		Thread th=new Thread(th2,"thread name");
		th.start();
	  	String name=th.getName();
	  	System.out.println(name);
	}

}
