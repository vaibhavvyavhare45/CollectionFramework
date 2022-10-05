package collection.vector.stack;

import java.util.Stack;

public class StackDemo {
	/**
	 * @param args
	 * this method perform on the stack opration  it follow the LIFO
	 */
	public static void main(String[] args) {
		Stack s=new Stack<>();
		s.push("ram");
		s.push("vaibhav");
		s.push(10);
		s.push(72.63);
		s.push('k');
		
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.peek());//last enter top element
		System.out.println(s.pop());//top element from the stack
		System.out.println(s.search("ram"));
	}

}
