package single_list;

public class SingleLinkedList {
	private Node first;

	public void printList() {
		System.out.println("From first --> last");
		Node current = first;
		  while (current != null) {
			  System.out.println(current.data);
				current = current.next;
		  };
	}

	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;

	}
	
	public void deleteFirst() {
		Node tmp = first.next;
		first.next = null;
		first = tmp;
	}
	
	public void addAfter(int data, int given) {
		Node newNode = new Node();
		newNode.data = data;
		Node current = first;
		while(current.next != null) {
			if(current.data == given) {
				break;
			}
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		 
	}
	
	public void addLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		Node current = first;
		while(current.next != null) {
			
			current = current.next;
		}
		current.next = newNode;
	}
}
