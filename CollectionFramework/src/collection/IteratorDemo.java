package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	al.add(10);
	al.add(30);
	al.add(40);
	al.add(50);
	al.add(128);
	al.add("vaibhav");
	
	Iterator itr= al.iterator();
	while(itr.hasNext()) {
		if(itr.next()=="vaibhav");
			itr.remove();
			//al.remove(4);this comment out throws the concurrent madification exception
	
	}
	System.out.println(al);
		
	}

}
