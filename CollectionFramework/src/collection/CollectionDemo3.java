package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionDemo3 {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add("python");
		ar.add("kotlin");
		ar.add("jift");
		ar.add("Ruby");
		ListIterator litr=ar.listIterator();
		System.out.println(ar);
		while(litr.hasNext()) {
			
			
			//if((litr.next()=="kotlin")||(litr.next()==Integer.valueOf(10))) {
//				if(litr.next()==Integer.valueOf(100)) {
			if(litr.next()=="kotlin") {
			//	litr.remove();
				litr.add(50);
				
				}
			
				
				
				
			}
		
		System.out.println(ar);
		Object arrs=ar.set(2,"Salim");
		System.out.println(arrs);
		System.out.println(ar);
	
	}
}
