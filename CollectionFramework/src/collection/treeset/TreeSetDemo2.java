package collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		String s1="AAAA";
		StringBuffer sb=new StringBuffer("BBBB");
		StringBuilder sb1=new StringBuilder("DDDD");
		//ClassCastException becouse of TreeSet allowed homogenous object and sb and sbl and String are sibling 
		TreeSet ts=new TreeSet<>();
		ts.add(s1);
		ts.add(sb);
		ts.add(sb1);
		System.out.println(ts);
	}
	
}
