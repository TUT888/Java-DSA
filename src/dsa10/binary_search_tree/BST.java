package dsa10.binary_search_tree;

import java.util.ArrayList;

public class BST extends BinaryTree {
	// ====== Build BST ====== //
	public void buildBST(int[] inputArray) {
		for (int value : inputArray) {
			if (root == null) {
				root = new Node(value);
				continue;
			}
			insertNode(root, value);
			balanceTreeRecursion(null, root);
		}
	}
	
	private Node insertNode(Node node, int value) {
		if (node == null) return new Node(value);
		
		if (value < node.value) {
			node.left = insertNode(node.left, value);
		} else {
			node.right = insertNode(node.right, value);
		}
		
		return node;
	}
	
	private int[] balanceTreeRecursion(Node parentNode, Node node) {
		if (node == null) return new int[]{-1, -2, -2};
		
		// Calculate height of each sub-tree
		// Return array should be: [height, left height, right height]
		int[] leftTreeHeight = balanceTreeRecursion(node, node.left); 
		int[] rightTreeHeight = balanceTreeRecursion(node, node.right);
		
		// Calculate height of current tree
		int[] currentTreeHeight = new int[3];
		currentTreeHeight[1] = leftTreeHeight[0];
		currentTreeHeight[2] = rightTreeHeight[0];
		
		// Check imbalance left
		if (leftTreeHeight[0] - rightTreeHeight[0] > 1) {
			// Left tree has left height < right height
			if (leftTreeHeight[1] < leftTreeHeight[2]) {
				rotateLeft(node, node.left);
			} 
			
			// Rotate right & update height
			rotateRight(parentNode, node);
			currentTreeHeight[1] -= 1;
			currentTreeHeight[2] += 1;
		} 
		
		// Check imbalance right
		if (rightTreeHeight[0] - leftTreeHeight[0] > 1) {
			// Right tree has right height < left height
			if (rightTreeHeight[2] < rightTreeHeight[1]) {
				rotateRight(node, node.right);
			} 
			
			// Rotate left & update height
			rotateLeft(parentNode, node);
			currentTreeHeight[1] += 1;
			currentTreeHeight[2] -= 1;
		} 

		// Calculate height
		currentTreeHeight[0] = Math.max(currentTreeHeight[1], currentTreeHeight[2]) + 1;
 		return currentTreeHeight;
	}
	
	private void rotateRight(Node parentNode, Node node) {
		Node rotatedNode = node.left;
		node.left = rotatedNode.right;
		rotatedNode.right = node;
		
		// Update parent's child node
		if (parentNode == null) {
			root = rotatedNode;
		} else if (parentNode.left != null && parentNode.left.value == node.value) {
			parentNode.left = rotatedNode;
		} else {
			parentNode.right = rotatedNode;
		}
	}
	
	private void rotateLeft(Node parentNode, Node node) {
		Node rotatedNode = node.right;
		node.right = rotatedNode.left;
		rotatedNode.left = node;
		
		// Update parent's child node
		if (parentNode == null) {
			root = rotatedNode;
		} else if (parentNode.left != null && parentNode.left.value == node.value) {
			parentNode.left = rotatedNode;
			
		} else {
			parentNode.right = rotatedNode;
		}
	}

	// ====== Print BST ====== //
	public void printBST() {
		if (root == null) return;
		
		ArrayList<Node> nodeList = new ArrayList<Node>();
		nodeList.add(root);
		while (nodeList.size() > 0) {
			Node currentNode = nodeList.remove(0);
			System.out.print(currentNode.value + " ");

			if (currentNode.left != null) nodeList.add(currentNode.left);
			if (currentNode.right != null) nodeList.add(currentNode.right);
		}
		System.out.println();
	}
}
