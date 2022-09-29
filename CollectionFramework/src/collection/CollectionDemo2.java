package collection;

import java.util.ArrayList;

public class CollectionDemo2 {
	public static void main(String[] args) {
		
		ArrayList lang=new ArrayList();
		lang.add("java");
		lang.add("cpp");
		lang.add("python");
		lang.add("kotlin");
		System.out.print("\n my first arraylist:\n "+lang);
		System.out.print("\n---------------------------------\n");
		ArrayList lang2=new ArrayList();
		lang2.add("java");
		lang2.add("R");
		lang2.add("cpp");
		lang2.add("kotlin");
		System.out.print("\n my second arraylist:\n "+lang2);
		
		System.out.print("\n---------------------------------\n");
		lang.add(1,"JavaScript");
		System.out.print("\n add specified index in arraylist:\n "+lang);
		lang.remove(2);
		System.out.print("\n remove specified index element in arraylist:\n "+lang);
//		lang.removeAll(lang);
//		System.out.println("\n this method remove  all element in the arraylist:\n "+lang);
		lang2.retainAll(lang);
		System.out.println("\n retain element in the arraylist:\n "+lang2);
		System.out.println("\n--------------------------------\n");
		
		System.out.println("contain: "+	lang.contains("cpp"));
		System.out.println("contain: "+	lang.contains("java"));
		System.out.println("\n--------------------------------\n");
		System.out.println(lang);
		System.out.println(lang2);
		System.out.println("containsAll(Collection c)"+lang.containsAll(lang2));
		//lang2 all element present in lang then it result will be true 
		System.out.println("containsAll(Collection c)"+lang2.containsAll(lang));
		//lang all element not present in lang2 then it result will be false 
		System.out.println("\n************************************\n");
		ArrayList lang3=new ArrayList();
		
		System.out.println(lang3.addAll(lang2));
		
		System.out.print("\n ArrayList3:\n "+lang3);
		System.out.println("\n---------------------------------------------\n");
		
	}

}
