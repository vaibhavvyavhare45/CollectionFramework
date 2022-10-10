package collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo3 {
public static void main(String[] args) {
	

	Student s1=new Student(10,"ram");
	Student s2=new Student(8,"krisna");
	Student s3=new Student(2,"ganesh");
	
	TreeSet ts=new TreeSet<>();
	ts.add(s3);
	ts.add(s1);
	ts.add(s2);
	System.out.println(ts);
}
}
