package data_structures.binary_search_tree;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[] {3, 2, 7, 4, 6, 5};
		BST bst = new BST();
		bst.buildBST(arr);
		bst.printBST();
		System.out.println("Is balance: " + bst.isBalance());
		System.out.println();
		
		arr = new int[] {1, 5, 6, 8, 9, 2, 0, 13, 10};
		bst = new BST();
		bst.buildBST(arr);
		bst.printBST();
		System.out.println("Is balance: " + bst.isBalance());
		System.out.println();
		
		arr = new int[] {1, 5, 6, 8, 9, 20};
		bst = new BST();
		bst.buildBST(arr);
		bst.printBST();
		System.out.println("Is balance: " + bst.isBalance());
	}
}
