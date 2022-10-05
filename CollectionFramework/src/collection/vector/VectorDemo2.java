package collection.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		
		v1.add("vaibhav");
		v1.add(10);
		v1.add("Mukund");
		v1.add(20);
		v1.add("Vishwjeet");
		v1.add(20);
		v1.add("pranav");
		v1.add(30);
		v1.add("Akashay");
		v1.add(40);
		Vector v2=new Vector<>();
		v2.addAll(v1);
		System.out.println(v1);
		System.out.println(v2);
		
		
		v1.add(1, "marish");
		System.out.println(v1);
		
		Iterator itr=v1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("convert vector vector to array");
		Object a[]=new Object[v1.size()];
		v1.toArray(a);
		for (Object object : a) {
			System.out.println(object);
		
	
		}
		//toString method use in vector in java 
		System.out.println(v1.toString());
		
		}
		
			
		
	}




