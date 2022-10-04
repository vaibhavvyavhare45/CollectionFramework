package hashsets;

import java.util.HashSet;

public class HashMapDebugViewDemo1 {
		public static void main(String[] args) {
			 String s1="AAA";
			String s2="BBB";
			String s3="CCC";
			String s4="BBB";
			String s5="AAA";
			HashSet hs=new HashSet();
			System.out.println(hs.add(s1));
			System.out.println(hs.add(s2));
			System.out.println(hs.add(s3));
			System.out.println(hs.add(s4));
			System.out.println(hs.add(s5));
			
		System.out.println(hs);	
		}
}
