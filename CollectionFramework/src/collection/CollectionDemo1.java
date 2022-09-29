	package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo1 {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		//al.add(128);//Integer constant pooling  concept use
		al.add(20);
		al.add("Hello");
		al.add("Ram");
		al.add("hello");
		al.add("City");
		
		Iterator itr = al.iterator();
			while(itr.hasNext()) {
				if(itr.next()==(Integer.valueOf(20)))
				{
					itr.remove();
					
				}
//	            System.out.println(itr.next());
			}
			System.out.println(al);
		}
		
}
		
	
		
	
	
	


