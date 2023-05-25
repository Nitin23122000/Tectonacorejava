package abc;

public class setnmbycons extends Thread{
	setnmbycons(String name){
		super(name);
	}
	
	public void run() {
		System.out.println("Running....");
	}
   
	
	public static void main(String[] args) {
		 setnmbycons sc=new setnmbycons("Nitin");
		 setnmbycons sc2=new setnmbycons("kumar");
		 
		 System.out.println(sc.getName());
		 System.out.println(sc2.getName());
		 
		 sc.start();
		 sc2.start();
	}
}
