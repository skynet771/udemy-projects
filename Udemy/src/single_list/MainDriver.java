package single_list;

public class MainDriver {

	public static void main(String[] args) {
		SingleLinkedList ls = new SingleLinkedList();

		ls.add(55);
		ls.addLast(63);
		ls.addAfter(10, 63);
		ls.deleteFirst();
		ls.printList();
	}

}
