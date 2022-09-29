package collection.linkedlist;

import java.util.LinkedList;

public class CollectionDemo1 {
	public static void main(String[] args) {
		LinkedList  ll=new LinkedList<>();
		ll.add("visham");
		ll.add("vaibhav");
		ll.add("mukundawjeet");
		ll.add("Ra");
		ll.add("Ram");
		System.out.println(ll);
		ll.add(2,"pranav");
		ll.set(3,"gajanan");
		ll.remove(2);
		
		System.out.println(ll);
		int po=ll.indexOf("vaibhav");
//	 	ll.indexOf("vaibhav");// index of retrun -1 because of the underline data structure is double linked list
		System.out.println(po);
		
		
		System.out.println(ll.lastIndexOf("Ram"));
		
		ll.addFirst("Ram");
		ll.addLast("Ganesh");
		System.out.println(ll);
		
		
		
		
	}

}
