package collection.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {

		SortedSet ss = new TreeSet();
		ss.add('A');
		ss.add('B');
		ss.add('D');
		ss.add('C');
		System.out.println(ss);
		System.out.println(ss.comparator());
		// it return null then use for natural sorting for using comparable

		System.out.println(ss.subSet('A', 'D'));
		// it return the portion of view of this set and last element is exclusive skip

		System.out.println(ss.tailSet('C'));
		// it return the portion of view of this set
		// whose element are >=from element

		System.out.println(ss.headSet('C'));
		// it return the portion of view of this set
		// whose element are <=from element

		System.out.println(ss.first());// return lowest element
		System.out.println(ss.last());// return highest element
	}

}
