package data_structures.linkedlist;

public class BE8LinkedList {
	LinkedListItem head;
	
	// Insert at any index
	// Time: O(n)
	// Space: O(1) 
	public boolean insert(int index, int value) {
		if (head == null) {
			head = new LinkedListItem(value);
			return true;
		}
		
		if (index == 0) {
			head = new LinkedListItem(value, head);
			return true;
		}
		
		LinkedListItem item = head;
		int i = 0;
		while (i < index-1) {
			i++;
			item = item.next;
			if (item == null) {
				// index is out of linkedlist's range
				return false;
			}
		}
		
		item.next = new LinkedListItem(value, item.next);
		return true;
	}
	
	// Delete any index
	// Time: O(n)
	// Space: O(1) 
	public boolean delete(int index) {
		if (head == null) {
			return false;
		}

		if (index == 0) {
			head = head.next;
			return true;
		}
		
		LinkedListItem item = head;
		int i = 0;
		while (i < index-1) {
			i++;
			item = item.next;
			if (item == null) {
				// index is out of linkedlist's range
				return false;
			}
		}
		
		item.next = item.next.next;
		return true;
	}
}
