package abc;

public class Threadprac {
	public static void main(String[] args) {
		try {
			System.out.println("Thread started...");
			for(int j=0;j<=5;j++) {
				// if we declare negative time in argument then illegalArgumentException will be Thrown
				Thread.sleep(200);
				System.out.println(j);
			}
			System.out.println("Thread ended...");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
