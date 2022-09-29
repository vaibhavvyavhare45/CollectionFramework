package collection;

import java.util.ArrayList;

	import java.lang.reflect.Field;
	import java.util.*;

	public class ArrayListDemo {
		// to check the capacity from the internet
	    static int getCapacity(List al) throws Exception {
	        Field field = ArrayList.class.getDeclaredField("elementData");
	        field.setAccessible(true);
	        return ((Object[]) field.get(al)).length;
	    }

	    public static void main(String[] args) throws Exception{

	        ArrayList al1 = new ArrayList();

	        al1.add(10);
	        al1.add(20);
	        al1.add(10);
	        al1.add(20);
	        al1.add(10);
	        al1.add(20);

	        Iterator itr = al1.iterator();

	        while(itr.hasNext())
	        {
	            System.out.println(itr.next());
	        }
	        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	        for (Object a : al1)
	        {
	            System.out.println(a);
	        }

	        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	        ListIterator listItr = al1. listIterator();

	        while (listItr.hasNext())
	        {
	            System.out.println(listItr.next());
	            System.out.println(listItr.nextIndex());

	        }

	        System.out.println(al1);


	    }
	
}
