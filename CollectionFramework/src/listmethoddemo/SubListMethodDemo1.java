package listmethoddemo;

import java.util.ArrayList;
import java.util.List;

public class SubListMethodDemo1 {
	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add("vaibhav");
		l.add("mukund");
		l.add("pranav");
		l.add("vishwajit");
		l.add("marish");
		System.out.println(l);
		List l1=new ArrayList<>();
		l1=l.subList(1, 3);//this method use for lastIndex-1;
		System.out.println(l1);
		l1.add(2,"mar");
		System.out.println(l);
	}

}
