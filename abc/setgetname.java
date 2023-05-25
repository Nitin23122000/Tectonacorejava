package abc;

public class setgetname extends Thread {
	
	public void run() {
		System.out.println("Running....");
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		setgetname sg=new setgetname();
		setgetname sg2=new setgetname();
		sg.start();
		sg2.start();
		
		System.out.println("Before changing the name : "+sg.getName());
		System.out.println("Before changing the name : "+sg2.getName());
		sg.setName("Nitin Prajapat");
		System.out.println("After Changing the name : "+sg.getName());
		
	}

}
