package dsa7.binary_tree;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Init tree
		//        0
		//    /      \
		//   1         2
		//  /  \      / \
		// 11  12   21  22
		//    /     /     \
		//   121   211    222
		//      \
		//     1212
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(0);
		
		tree.root.left = new Node(1);
		tree.root.left.left = new Node(11);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(121);
		tree.root.left.right.left.right = new Node(1212);
		
		tree.root.right = new Node(2);
		tree.root.right.left = new Node(21);
		tree.root.right.left.left = new Node(211);
		tree.root.right.right = new Node(22);
		tree.root.right.right.right = new Node(222);


		System.out.println("Height: " + tree.getHeight());
		
		System.out.println("Is balance V1: " + tree.isBalanceV1());
		System.out.println("Is balance V2: " + tree.isBalanceV2());
		
		System.out.println("All imbalance nodes: ");
		for (Node node : tree.findImbalanceNode()) {
			System.out.println("Node: " + node.value);
		}
	}
}
