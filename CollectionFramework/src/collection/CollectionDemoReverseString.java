package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemoReverseString {
	 public static void main(String[] args) {
		    ArrayList <String>al=new ArrayList<>();
		    al.add("mukund");
		    al.add("vaibhav");
		    al.add("pranav");
		    al.add("vishwajeet");
		    al.add("marish");
		    System.out.println(al);
		   String si[]=new String[al.size()];
		        for(int i=0;i<si.length;i++){
		           String s=al.get(i);
		            StringBuffer sb=new StringBuffer(s);
		            sb.reverse();
		            si[i]=sb.toString();
		               
		        }
		        List l=Arrays.asList(si);
		        System.out.println(l);

		}


}
