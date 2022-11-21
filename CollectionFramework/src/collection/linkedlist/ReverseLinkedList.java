package collection.linkedlist;

public class ReverseLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node reverse(Node node) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;

	}

	void printList(Node node) {
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}

	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(20);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(15);

		System.out.println("given linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println(" ");
		System.out.println("reverse linkedlist:  ");
		list.printList(head);

	}

}
