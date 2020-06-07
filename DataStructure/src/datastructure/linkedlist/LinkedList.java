package datastructure.linkedlist;

class Node {
	Node next;

	public Node getNext() {
		return next;
	}

	public void setNext(Node node) {
		next = node;
	}

	int data;

	public int getData() {
		return data;
	}

	public void setData(int d) {
		data = d;
	}

	public Node(int d) {
		data = d;
		next = null;
	}

	public Node(int d, Node node) {
		data = d;
		next = node;
	}

}

public class LinkedList {

	// properties
	Node head;
	int count;

	// constructors
	public LinkedList() {
		head = null;
		count = 0;
	}

	public LinkedList(Node node) {
		head = node;
		count = 1;
	}

	// methods

	// 1. add

	public void add(int newData) {
		Node temp = new Node(newData);
		Node curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(temp);
		count++;
	}
	// 2. get

	public int get(int index) {
		if (index <= 0) {
			return -1;
		} else {
			Node curr = head;
			for (int i = 1; i < index; i++) {
				curr = curr.getNext();
			}
			return curr.getData();
		}
	}

	// 3. size
	public int size() {
		return count;
	}

	// 4. isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	// 5. remove

	public void remove() {
		Node curr = head;
		while (curr.getNext().getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(null);
		count--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
