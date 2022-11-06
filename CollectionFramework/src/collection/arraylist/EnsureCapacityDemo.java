package collection.arraylist;

import java.util.ArrayList;

public class EnsureCapacityDemo {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.ensureCapacity(3);
	al.add("vaibhav");
	al.add("mukunda");
	al.add("gajanan");
	System.out.println(al);
	al.add("ganesh");
	System.out.println(al);
	
}
}
