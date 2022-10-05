package collection.vector;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector  v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(90);
		v.add(100);
		v.add(110);
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		v.add(16);
		v.add(17);
		v.add(18);
		v.add(19);
		v.add(20);
		v.add(21);
		v.add(22);
		v.add(23);
		v.add(24);
		v.add(25);
		v.add(26);
		v.add(27);
		v.add(28);
		v.add(29);
		v.add(30);
		v.add(31);
		v.add(21);
		v.add(22);
		v.add(23);
		v.add(24);
		v.add(25);
		v.add(26);
		v.add(27);
		v.add(28);
		v.add(29);
		v.add(30);
		v.remove(2);
		System.out.println(v.toString());
		System.out.println(v.capacity());
		for (Object object : v) {
			System.out.println(object);
		}
		
	}
}
