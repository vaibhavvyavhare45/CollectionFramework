package hashsets;

import java.util.HashSet;

public class HashMapDebugViewDemo5 {

 
public static void main(String[] args) {
	Student s1=new Student(10,"AAA");
	
	
	  
	Student s2=new Student(20,"BBB");
	//Student s3=s1;
	Student s3=new Student(10,"AAA");
	//Student s3=new Student(100,"AAA");//showing the four object
	Student s4=new Student(30,"CCC");
	HashSet hs=new HashSet<>();
	hs.add(s1);
	hs.add(s2);
	hs.add(s3);
	hs.add(s4);
	System.out.println(hs);
	
}


}
