package double_linked_list;

public class DoubleLinkedList {
	private Node first;
	private Node last;

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode;
		} else {
			first.previous = newNode;
		}
		newNode.next = first;
		this.first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}

	public void deleteLast() {
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;

		}
		last = last.previous;

	}

}
