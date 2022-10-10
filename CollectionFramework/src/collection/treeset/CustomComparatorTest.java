package collection.treeset;

import java.util.TreeSet;

public class CustomComparatorTest {

	public static void main(String[] args) {
		
		Student1 s1=new Student1(45,"vaibhav");
		Student1 s2=new Student1(30,"mukund");
		Student1 s3=new Student1(25,"vishwajeet");
		Student1 s4=new Student1(10,"pranav");
		//Student1RollNoComparator src= new Student1RollNoComparator();
		//Student1NameComparator snc=new Student1NameComparator();
		TreeSet ts=new TreeSet(new Student1RollNoComparator());
		
		ts.add(s3);
		ts.add(s1);
		ts.add(s4);
		ts.add(s2);
		
		System.out.println(ts);
		TreeSet ts1=new TreeSet(new Student1NameComparator());
		ts1.add(s3);
		ts1.add(s1);
		ts1.add(s4);
		ts1.add(s2);
		System.out.println(ts1);
		
		
	}
	
}
