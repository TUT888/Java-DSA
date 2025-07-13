package dsa04.linkedlist;

public class LinkedListItem {
	Integer value;
	LinkedListItem next;
	
	public LinkedListItem(Integer value) {
		super();
		this.value = value;
	}

	public LinkedListItem(Integer value, LinkedListItem next) {
		super();
		this.value = value;
		this.next = next;
	}
}
