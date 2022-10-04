package hashsets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapDebugViewDemo {
	public static void main(String[] args) {
		String s1="FB";
		String s2="Ea";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode());
//		Map <String,Integer>map=new HashMap<>();
//		map.put(s1, 1);
//		map.put(s2, 2);
		HashSet hs=new HashSet<>();
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs);
		
	}

}
