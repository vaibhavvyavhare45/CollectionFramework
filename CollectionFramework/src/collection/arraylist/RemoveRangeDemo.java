package collection.arraylist;

import java.util.ArrayList;

public class RemoveRangeDemo extends ArrayList<Integer> {

public static void main(String[] args) {
	RemoveRangeDemo al=new RemoveRangeDemo();
	
	al.add(10);
	al.add(25);
	al.add(21);
	al.add(36);
	al.add(28);
	al.add(26);
	System.out.println(al);
	
	ArrayList a=new ArrayList<>();
	al.removeRange(0,3);	
	System.out.println(al);
	
}


}
