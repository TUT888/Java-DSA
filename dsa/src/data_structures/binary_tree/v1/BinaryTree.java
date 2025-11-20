package data_structures.binary_tree.v1;

import java.util.ArrayList;

public class BinaryTree {
	Node root;

	public int getHeight() {
		return height(root);
	}
	
	public int height(Node node) {
		if (node == null) return -1;
		return Math.max(height(node.left), height(node.right)) + 1;
	}
	
	public void printTreeBFS() {
		if (root == null) return;
		
		ArrayList<Node> nodeList = new ArrayList<Node>();
		nodeList.add(root);
		while (nodeList.size() > 0) {
			Node currentNode = nodeList.removeFirst();
			System.out.print(currentNode.value + " ");

			if (currentNode.left != null) nodeList.add(currentNode.left);
			if (currentNode.right != null) nodeList.add(currentNode.right);
		}
		System.out.println();
	}

	// ====== DSA Day 8: Balance Tree ====== //
	public void balanceTree() {
		balanceTreeRecursion(null, root);
	}
	
	private int balanceTreeRecursion(Node parentNode, Node node) {
		if (node == null) return -1;
		
		// Calculate height
		int hLeft = balanceTreeRecursion(node, node.left);
		int hRight = balanceTreeRecursion(node, node.right);
		
		// Check imbalance node & rotate
		if ((hLeft - hRight) > 1) {
			// Rotate right
			Node rotatedNode = node.left;
			if (rotatedNode.left == null) {
				// Swap left and right
				rotatedNode.left = rotatedNode.right;
				rotatedNode.right = null;
			} 
			node.left = rotatedNode.right;
			rotatedNode.right = node;
			
			// Update parent's child node
			if (parentNode == null) {
				root = rotatedNode;
			} else if (parentNode.left.value == node.value) {
				parentNode.left = rotatedNode;
			} else {
				parentNode.right = rotatedNode;
			}
			
			return hLeft;
		}
		if ((hRight - hLeft) > 1) {
			// Rotate left
			Node rotatedNode = node.right;
			if (rotatedNode.right == null) {
				// Swap left and right
				rotatedNode.right = rotatedNode.left;
				rotatedNode.left = null;
			} 
			node.right = rotatedNode.left;
			rotatedNode.left = node;
			
			// Update parent's child node
			if (parentNode == null) {
				root = rotatedNode;
			} else if (parentNode.left.value == node.value) {
				parentNode.left = rotatedNode;
			} else {
				parentNode.right = rotatedNode;
			}
			
			return hRight;
		}
		
		// Calculate height
		return Math.max(hLeft, hRight) + 1;
	}
	
	// ====== DSA Day 7: Check balance and find imbalance node ====== //
	// Check balance
	public boolean isBalanceV1() {
		if (root == null) return false;

		ArrayList<Node> nodeList = new ArrayList<Node>();
		nodeList.add(root);
		while (nodeList.size() > 0) {
			Node currentNode = nodeList.removeFirst();
			
			int h1 = height(currentNode.left);
			int h2 = height(currentNode.right);
			if (Math.abs(h1-h2) > 1) return false;

			if (currentNode.left != null) nodeList.add(currentNode.left);
			if (currentNode.right != null) nodeList.add(currentNode.right);
		}
		
		return true;
	}
	
	public boolean isBalanceV2() {
		return checkBalanceWithHeight(root) != -1;
	}
	
	private int checkBalanceWithHeight(Node node) {
		if (node == null) return 0;
		
		// Calculate height & check imbalance of child node
		// h = -1 => imbalance
		int h1 = checkBalanceWithHeight(node.left);
		if (h1 == -1) return -1;
		
		int h2 = checkBalanceWithHeight(node.right);
		if (h2 == -1) return -1;
		
		// Check imbalance of  current node 
		// |h1 - h2| > 1 => return -1 for imbalance
		if (Math.abs(h1-h2) > 1) return -1;
		
		// Return current level
		return Math.max(h1, h2) + 1;
	}
	
	// Find imbalance node
	public ArrayList<Node> findImbalanceNode() {
		ArrayList<Node> result = new ArrayList<Node>();
		findImbalanceWithHeight(result, root);
		
		return result;
	}
	
	private int findImbalanceWithHeight(ArrayList<Node> nodeList, Node node) {
		if (node == null) return -1;
		
		// Calculate height
		int h1 = findImbalanceWithHeight(nodeList, node.left);
		int h2 = findImbalanceWithHeight(nodeList, node.right);
		
		// Check imbalance node
		// if |h1 - h2| > 1 => this node is imbalance => add to list
		if (Math.abs(h1-h2) > 1) {
			nodeList.add(node);
		}
		
		// Calculate height
		return Math.max(h1, h2) + 1;
	}
}
