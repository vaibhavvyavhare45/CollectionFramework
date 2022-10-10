package collection.treeset;

import java.util.Objects;

public class Student1  {
	int rollno;
	String name;
	
	public Student1() {
		
	}

	public Student1(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}
	
	
	
	

}
