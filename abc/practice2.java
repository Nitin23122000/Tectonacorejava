package abc;

import java.util.Iterator;
import java.util.Scanner;

class ageInvalidexception extends Exception{
	
	ageInvalidexception(){
		super("Age is invalid");
	}
	ageInvalidexception(String messege){
		super(messege);
	}
}
public class practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("program stated...");
			int n1;
			n1=sc.nextInt();
			int n2;
			n2=sc.nextInt();
			System.out.println("We got two numbers");
			if(n2<10) {
				throw new ageInvalidexception("good job");
			}
			int result = n1 / n2;
			System.out.println("result  "+result);
			System.out.println("Terminated...");
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("hello");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("bye");
		}
		
		

	}
}
