package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionDemo5 {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(50);
		ar.add("Ram");
		ListIterator litr= ar.listIterator(3);
		System.out.println(ar);
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
	}

}
