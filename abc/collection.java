package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class collection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		list.add("nitin");
		list.add("prajapat");
		list.add("sirohi");
		list.add(1,"rampura");
		
		System.out.println(list);
		
		Vector<String> vector=new Vector<>();
		vector.addAll(list);
		
		System.out.println(vector);
		
		//for each loop for traversing
		for(String str : list) {
			System.out.println(str);
			StringBuffer sb= new StringBuffer(str);
			System.out.println(sb.reverse());
		}
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			String next =itr.next();
			System.out.println(next);
		}
		
		ListIterator<String> litr=list.listIterator(list.size());
			while(litr.hasPrevious()) {
				String previous=litr.previous();
				System.out.println(previous);
			}
			
			
			//foreach method for traversing
			list.forEach(e->{
				System.out.println(e);
				
			});
			
			HashMap<String, Integer> maps= new HashMap<>();
			 maps.put("nitin", 1);
			 maps.put("kumar", 22);
			 
			 
			 maps.forEach((e1,e2)->{
				 System.out.println(e1+"->"+e2);
			 });
	}

}
