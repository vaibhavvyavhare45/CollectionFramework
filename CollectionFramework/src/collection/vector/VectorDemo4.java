package collection.vector;

import java.util.Vector;

public class VectorDemo4 {
	public static void main(String[] args) {
		Vector v1=new Vector<>();
		v1.add("c");
		v1.add("c++");
		v1.add("java");
		System.out.println(v1.size());
		System.out.println(v1.isEmpty());
		System.out.println(v1.elementAt(0));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		v1.setElementAt("mukund", 2);
		System.out.println(v1);
		v1.removeElementAt(0);
		System.out.println(v1);
		v1.insertElementAt("vaibhav", 0);
		v1.insertElementAt("marsh", 3);
		System.out.println(v1);
		
		
		System.out.println(v1.capacity());
		System.out.println(v1);
		String str[]=new String[v1.size()];
		for (String s : str) { 
			System.out.println(s);
		}
			v1.copyInto(str);
		
		System.out.println("-----copy into-----");
		for (String s : str) {
			System.out.println(s);
		}
		
	}

}
