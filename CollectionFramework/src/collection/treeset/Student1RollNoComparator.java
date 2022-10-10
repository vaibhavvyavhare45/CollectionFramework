package collection.treeset;

import java.util.Comparator;

public class Student1RollNoComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student1 s=(Student1) o1;
		Student1 s1=(Student1) o2;
		if(s.rollno==s1.rollno)
			return 0;
			else if(s.rollno>s1.rollno)
				return 1;
		else 
			return -1;
		
		
	}

	//@Override
	//public int compare(Student1 r1, Student1 r2) {
//		if(r1.rollno==r2.rollno)
//		return 0;
//		else if(r1.rollno>r2.rollno)
//			return 1;
//		else 
//			return -1;
	//}

	

}
