package collection.treeset;

public class Student implements Comparable{
	int rollno;
	String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public String toString() {
		return "Student{rollno="+ rollno + ", name="+name+"}";
		
	}

	

	@Override
	public int compareTo(Object o) {//Acceding order sorting logic
		Student s1=(Student) o;
		if(this.rollno==s1.rollno)
			return 0;
		else if (this.rollno>s1.rollno)
			return 4;
		else
			return -4;	
		
	}
	
//	@Override
//	public int compareTo(Object o) {//Descending order sorting logic
//		Student s1=(Student) o;
//		if(this.rollno==s1.rollno)
//			return 0;
//		else if (this.rollno>s1.rollno)
//			return -4;
//		else
//			return 4;	
//		
//	}
	
	
	

}
