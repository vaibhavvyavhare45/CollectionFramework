package collection.treeset;

import java.util.Comparator;

public class Student1NameComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 nm1, Student1 nm2) {
		
		return -(nm1.name.compareTo(nm2.name));
	}
	

}
