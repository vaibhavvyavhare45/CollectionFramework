package collection.vector;

import java.util.Vector;

public class VectorDemo3 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("vaibhav");
		v1.addElement(10);
		v1.addElement("pranav");
		v1.addElement("20");
		System.out.println(v1);
		System.out.println(v1.capacity());
	
		System.out.println(v1.removeElement(10));
		System.out.println(v1);
//		v1.removeAllElements();
//		System.out.println(v1);
		
		v1.trimToSize();//fix size array in present element
		System.out.println(v1.capacity());
		System.out.println(v1);
		
		v1.ensureCapacity(15);//increase the size of vector
		System.out.println(v1.capacity());
		
		v1.setSize(25);//set the size of vector
		System.out.println(v1.size());
		
		System.out.println(v1.indexOf("pranav"));//not pass the index
		
		System.out.println(v1.lastIndexOf("20"));//not pass the  index
		
			
		
		
		
		
		
		
	}

}
