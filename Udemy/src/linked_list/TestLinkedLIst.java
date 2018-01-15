package linked_list;

public class TestLinkedLIst {

	public static void main(String[] args) {

		Node nodeA = new Node();
		nodeA.data = 1;

		Node nodeB = new Node();
		nodeB.data = 2;

		Node nodeC = new Node();
		nodeC.data = 3;

		nodeA.next = nodeB;
		nodeB.next = nodeC;
		System.out.println(countNodes(nodeA));
		deleteNode(2, nodeA);
		System.out.println(countNodes(nodeA));

	}

	public static int countNodes(Node n) {
		Node current = n;
		int count = 0;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public static void deleteNode(int sum, Node head) {
		Node current = head;
		Node previous = head;
		while (current.next != null) {

			if (current.data == sum) {
				previous.next = current.next;
				previous = current;
				current = current.next;
				current.next = null;
			} else {
				previous = current;
				current = current.next;
			}

		}

	}

}
