package abc;

public class Main {
	public static void main(String[] args) {
		
		Company cp=new Company();
		Producer p=new Producer(cp);
		Consumer c=new Consumer(cp);
		p.start();
		c.start();
	}

}
