package collection;

import java.util.ArrayList;
import java.util.ListIterator;



public class CollectionDemo6 {
	public static void main(String[] args) {
	ArrayList al1=new ArrayList();
	al1.add("rahul");
	al1.add("vaibhav");
	al1.add("akshay");
	al1.add("mukund");
	
		ListIterator litr= al1.listIterator();
		while(litr.hasNext()) {
		
			if(litr.next()=="vaibhav") {
				//al1.add("vaibhav");
//				al1.remove(1);
				///this both condition is condition throws java.util.ConcurrentModificationException
			//litr.add("vaibhav");
				litr.remove();
			}
			
		}	
		for(Object s:al1) {
			System.out.println(s);
		}
	
		
		
	
		
	}

}
