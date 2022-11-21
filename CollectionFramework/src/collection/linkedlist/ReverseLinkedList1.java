package collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList1 {
	public static void main(String[] args) {
		
		LinkedList< Integer> l=new LinkedList<Integer>();
		l.add(14);
		l.add(25);
		l.add(9);
		l.add(24);
		System.out.println("element of linkedlist before reversing: "+l);
		Collections.reverse(l);
		System.out.println("element of linkedlist after reversing: "+l);
		
		System.out.println("*****************************************************");
		
		
		LinkedList<String> al=new LinkedList<>();
		al.add("vaibhav");
		al.add("marish");
		al.add("pranav");
		al.add("vishwajit");
		System.out.println(al);
		
		System.out.println("sorting decending order: ");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
	}
	

}
