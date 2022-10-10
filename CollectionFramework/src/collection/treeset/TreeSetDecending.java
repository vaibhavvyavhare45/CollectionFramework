package collection.treeset;

import java.util.TreeSet;

public class TreeSetDecending {
	public static void main(String[] args) {
		String s1="AAA";
		String s2="BBB";
		String s3="CCC";
		String s4="DDD";
		
		//DecendingStringComparable dsc=new DecendingStringComparable();
		TreeSet ts=new TreeSet<>(new DecendingStringComparable());
		ts.add(s3);
		ts.add(s1);
		ts.add(s4);
		ts.add(s2);
		System.out.println(ts);
		
		
	}

}
