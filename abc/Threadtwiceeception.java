package abc;

public class Threadtwiceeception extends Thread{
	public void run() {
		System.out.println("Thread is running....");
	}
	public static void main(String[] args) {
		// if we start a same thread twice then at first time it will run and second time
		//it will throw illegalThreadStateexception
		Threadtwiceeception twe =new Threadtwiceeception();
		twe.start();
		twe.start();
	}

}
