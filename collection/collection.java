package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class collection {

	public static void main(String[] args) {

		ArrayList< String> list=new ArrayList<String>();
		list.add("Nitin");
		list.add("Kumat");
		list.add("prajapat");
		list.add("solanki");
		list.add("String");
		list.contains("nitin");
		list.isEmpty();
		list.remove(1);
		System.out.println(list);
		
		Vector< String> vector=new Vector<String>();
		vector.addAll(list);
		System.out.println(vector);
		
		//vectoer is synchronized and arraylist is not synchronized
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Nitin", 111);
		map.put("kumar", 222);
		System.out.println(map);
		
		for (String string : map.keySet()) {
			System.out.println(string);
			
		}
		
		map.forEach((e1,e2)->{
			System.out.println(e1+" "+e2);
		});
		
		Iterator< String> itr=list.iterator();
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		
		ListIterator< String> litr=list.listIterator(list.size());
		while(litr.hasPrevious()) {
		  String msg = litr.previous();
		  System.out.println(msg);
		  
		}
	}
	
}
