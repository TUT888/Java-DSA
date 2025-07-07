package dsa9.binary_tree;

public class Main {
	public static void main(String[] args) {
		// Init tree
		//           1
		//        /     \
		//       2        3
		//     /  \     /   \
		//    9   11   4     5
		//   /             /   \
		//  10           7      6
		//             /    \
		//            8     12
		//           / \    /
		//         13  14  15
		// BFS before: 1 2 3 9 11 4 5 10 7 6 8 12 13 14 15
		// BFS after:  1 2 7 9 11 3 5 10 4 8 12 6 13 14 15
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(9);
		tree.root.left.left.left = new Node(10);
		tree.root.left.right = new Node(11);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(5);
		tree.root.right.right.left = new Node(7);
		tree.root.right.right.left.left = new Node(8);
		tree.root.right.right.left.left.left = new Node(13);
		tree.root.right.right.left.left.right = new Node(14);
		tree.root.right.right.left.right = new Node(12);
		tree.root.right.right.left.right.left = new Node(15);
		tree.root.right.right.right = new Node(6);
		testTree(tree);
		
		// Init tree
		//        5
		//    /       \
		//   19        21
		//  /  \      / \
		// 11  12   17   28
		//    /     /     \
		//   20    3      16
		//     \
		//     45
		// BFS before: 5 19 21 11 12 17 28 20 3  16 45 
		// BFS after:  5 19 21 11 20 17 28 45 12 3  16
		tree = new BinaryTree();
		tree.root = new Node(5);
		tree.root.left = new Node(19);
		tree.root.left.left = new Node(11);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(20);
		tree.root.left.right.left.right = new Node(45);
		tree.root.right = new Node(21);
		tree.root.right.left = new Node(17);
		tree.root.right.left.left = new Node(3);
		tree.root.right.right = new Node(28);
		tree.root.right.right.right = new Node(16);
		testTree(tree);
		
		// Init tree
		//             5
		//        	 /
		//          3
		//         /
		//        1
		//       /
		//      8
		//     /
		//    18
		// BFS before: 5 3 1 8  18
		// BFS after:  8 3 5 18 1
		tree = new BinaryTree();
		tree.root = new Node(5);
		tree.root.left = new Node(3);
		tree.root.left.left = new Node(1);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.left.left = new Node(18);
		testTree(tree);
	}
	
	private static void testTree(BinaryTree tree) {
		System.out.println("==========");
		System.out.println("Height: " + tree.getHeight());
		System.out.println("Is balance: " + tree.isBalance());
		System.out.print("All imbalance nodes: ");
		for (Node node : tree.findImbalanceNode()) {
			System.out.print(node.value + " ");
		}

		// Tree balancing
		System.out.println("\n\n-- Tree balancing --");
		System.out.print("Before balance: ");
		tree.printTreeBFS();
		
		System.out.print("After balance: ");
		tree.balanceTree();
		tree.printTreeBFS();
		
		System.out.println("\nIs balance: " + tree.isBalance());
		System.out.print("All imbalance nodes: ");
		for (Node node : tree.findImbalanceNode()) {
			System.out.print(node.value + " ");
		}
		System.out.println();
	}
}
