package collection.arraylist;

import java.util.ArrayList;

public class TrimToSizeDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(9);
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(10);
		System.out.println(al);
		System.out.println("this element are : ");
		al.trimToSize();// Trims the capacity of this ArrayList instance to be thelist's current size.
						// An application can use this operation to minimizethe storage of an ArrayList
						// instance.

		for (Integer i : al) {
			System.out.println("number: " + i);

		}

	}

}
