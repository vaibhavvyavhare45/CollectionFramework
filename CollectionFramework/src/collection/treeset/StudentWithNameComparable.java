package collection.treeset;

import java.util.Objects;

public class StudentWithNameComparable implements Comparable<Object> {
	int rollno;
	String name;
	
	public StudentWithNameComparable() {
		// TODO Auto-generated constructor stub
	}
	

	public StudentWithNameComparable(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
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
		StudentWithNameComparable other = (StudentWithNameComparable) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}
	


	@Override
	public String toString() {
		return "StudentWithNameComparable [rollno=" + rollno + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		StudentWithNameComparable s=(StudentWithNameComparable) o;
		return this.name.compareTo(s.name);
	}

	

}
