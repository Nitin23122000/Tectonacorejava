package abc;

public class MyThread1 {
	public static void main(String[] args) {
		Thread t1=new Thread("my First Thread");
		t1.start();
		String name=t1.getName();
		System.out.println(name);
	}

}
