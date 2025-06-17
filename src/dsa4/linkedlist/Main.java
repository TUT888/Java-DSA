package dsa4.linkedlist;

public class Main {
	public static void main(String[] args) {
		// Init linkedlist
		BE8LinkedList ll = new BE8LinkedList();
		ll.head = new LinkedListItem(0);
		ll.head.next = new LinkedListItem(1);
		ll.head.next.next = new LinkedListItem(2);
		printLinkedList(ll);
		
		// Insert new item at any index
		System.out.println("----- INSERT -----");
		ll.insert(3, 33);
		printLinkedList(ll);
		ll.insert(2, 22);
		printLinkedList(ll);
		ll.insert(0, 11);
		printLinkedList(ll);
		
		// Delete new item at any index
		System.out.println("----- DELETE -----");
		ll.delete(0);
		printLinkedList(ll);
		ll.delete(2);
		printLinkedList(ll);
		ll.delete(3);
		printLinkedList(ll);
	}
	
	public static void printLinkedList(BE8LinkedList ll) {
		LinkedListItem item = ll.head;
		while (item != null) {
			System.out.print(item.value + " ");
			item = item.next;
		}
		System.out.println();
	}
}
