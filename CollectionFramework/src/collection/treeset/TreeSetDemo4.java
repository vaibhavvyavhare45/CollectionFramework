package collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo4 {
	public static void main(String[] args) {
		StudentWithNameComparable s1 = new StudentWithNameComparable(10, "AAA");
		StudentWithNameComparable s2 = new StudentWithNameComparable(20, "BBB");
		StudentWithNameComparable s3 = new StudentWithNameComparable(5, "AAA");
		StudentWithNameComparable s4 = new StudentWithNameComparable(30, "CCC");
		StudentWithNameComparable s5 = new StudentWithNameComparable(35, "BBB");

		TreeSet hs = new TreeSet<>();
		hs.add(s1);
		hs.add(s2);

		hs.add(s3);
		hs.add(s4);
		System.out.println(hs);

	}

}
