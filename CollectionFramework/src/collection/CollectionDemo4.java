package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionDemo4 {
	public static void main(String[] args) {
		
	
	ArrayList al=new ArrayList();
	al.add("vaibhav");
	al.add("mukunda");
	al.add("vishwajeet");
	al.add("pranav");
	al.add("Marish");
	
	System.out.println(al);
	ListIterator litr=al.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	System.out.print("\n------------------------------\n");
	while(litr.hasPrevious()) {
		//System.out.println(""+litr.previous());
		
		System.out.println(litr.previousIndex());//return the reverse index on given collection
		System.out.println(litr.previous());//
		
	}
	
	
	}
}
