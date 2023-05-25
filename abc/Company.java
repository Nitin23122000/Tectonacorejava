package abc;

public class Company {
	
	int n;
	boolean cndn=false;
	//if cndn=false...producer chance
	//cndn=true...consumer chance
	 synchronized void Produced_item(int n) {
		 if(cndn) {
			 
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		this.n=n;
		System.out.println("produced : "+this.n);
		cndn=true;
		//if we dont notify to the next Thread then Deadlock Situation will occur 
		notify();
	}
	 synchronized int Consume_item() {
		 if(!cndn) {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		System.out.println("Consumed : "+this.n);
		cndn=false;
		notify();
		return this.n;
	}

}
