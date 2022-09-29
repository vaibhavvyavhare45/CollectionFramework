package collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo2 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("vaibhav");
		ll.add("pranav");
		ll.add("prathamesh");
		ll.add("Marish");
		ll.add("vishwajeet");
		ll.add("mukunda");
		ll.add(10);
		ll.add(25);
		Iterator itr=ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(" ");
		}
		System.out.println("---------------------------------------------------------------------");

		System.out.println(ll);
		Object value=ll.element();//this method use for the getting the head of list 
		System.out.println("head of the list: "+value);
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ll);
		System.out.println("print first element"+ll.getFirst());
		System.out.println("print last element"+ll.getLast());
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ll);
		ll.offer("Akshay");//this method use for insert the tail(last element)
		System.out.println("after insertion using offer():\n"+ll);
		ll.offerFirst("Ajay");
		System.out.println("after insertion using offerFirst():\n"+ll);
		ll.offerLast("shree");
		System.out.println("after insertion using offerLast():\n"+ll);
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ll);
		System.out.println("peek the  element in head of list:\n "+ll.peek());
		System.out.println("peek the first element in list:\n "+ll.peekFirst());
		System.out.println("peek the last element in list:\n "+ll.peekLast());
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ll);
		System.out.println("poll is retrive and remove the head:\n "+ll.poll());
		System.out.println(ll);
		System.out.println("poll is retrive and remove the first element in the list:\n "+ll.pollFirst());
		System.out.println(ll);
		System.out.println("poll is retrive and remove the last element in the list:\n "+ll.pollLast());
		System.out.println(ll);
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ll);
		Object ele=ll.pop();
		System.out.println("pop the element  in list:\n "+ele);//last in first out operation is perform
		System.out.println(ll);
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ll);
		ll.push("prakash");
		System.out.println("push the element in the list on the stack:\n "+ll);
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ll);
		Object returnVal=ll.removeFirstOccurrence("prakash");
		System.out.println("remove the first occurence in list:\n "+returnVal);
		System.out.println(ll);
		Object returnVal1=ll.removeLastOccurrence("Akshay");
		System.out.println("remove the last occurence in the list:\n "+returnVal1);
		System.out.println(ll);
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ll);
		System.out.println("removing last element in the list:\n "+ll.removeLast());
		System.out.println(ll);
		System.out.println("remove the head element:\n "+ll.remove());
		System.out.println(ll);
		System.out.println("remove the first element in the list:\n "+ll.removeFirst());
		System.out.println(ll);
		System.out.println("---------------------------------------------------------------------");

		
		
		

	}

}
