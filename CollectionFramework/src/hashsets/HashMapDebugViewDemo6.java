package hashsets;

import java.util.LinkedHashSet;

public class HashMapDebugViewDemo6 {
public static void main(String[] args) {
	Student s1=new Student(10,"AAA");
	Student s2=new Student(20,"BBB");
	Student s3=new Student(30,"CCC");
	Student s4=new Student(40,"DDD");
	Student s5=new Student(20,"BBB");
	
	LinkedHashSet lhs=new LinkedHashSet<>();
	
	lhs.add(s2);
	lhs.add(s3);
	lhs.add(s4);
	lhs.add(s5);
	lhs.add(s1);
	
	System.out.println(lhs);
}
}
