package com.prowings.basiccollectionprogram;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<ArrayList> al=new ArrayList<>();
		
		
		ArrayList<Integer> al1=new ArrayList<>();
		
		al1.add(10);
		al1.add(5);
		al1.add(9);
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(5);
		al2.add(4);
		al2.add(2);
		
		al.add(al1);
		al.add(al2);
		System.out.println(al);
		al1.retainAll(al2);
	
		System.out.println(al1);
		al.ensureCapacity(5);
		System.out.println(al);
	
		Object[] ele=al.toArray();
		System.out.println(Arrays.toString(ele));
		for(int i=0;i<ele.length;i++) {
			System.out.println(ele[i]);
		}
	}

}
