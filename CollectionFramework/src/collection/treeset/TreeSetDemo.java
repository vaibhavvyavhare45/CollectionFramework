package collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Student s1=new Student(10,"ram");
		Student s2=new Student(30,"krishna");
		Student s3=new Student(20,"ganesh");
		Student s4=new Student(50,"arjun");
		
		
		TreeSet ts=new TreeSet();
		ts.add(s2);
		ts.add(s3);
		ts.add(s1);
		ts.add(s4);
		System.out.println(ts);
	}

}
