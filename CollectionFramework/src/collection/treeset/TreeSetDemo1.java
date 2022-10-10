package collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		Student s1=new Student(10,"vaibhav");
		Student s2=new Student(30,"pranav");
		Student s3=new Student(9,"rahul");
		
		TreeSet t1=new TreeSet<>();
		t1.add(s2);
		t1.add(s3);
		t1.add(s1);
		System.out.println(t1);
	}

}
