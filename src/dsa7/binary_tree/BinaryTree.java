package dsa7.binary_tree;

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
	
	// ====== Check balance tree ====== //
	public boolean isBalance() {
		return checkBalanceWithHeight(root) != -1;
	}
	
	private int checkBalanceWithHeight(Node node) {
		if (node == null) return 0;
		
		// Calculate height
		int h1 = checkBalanceWithHeight(node.left);
		int h2 = checkBalanceWithHeight(node.right);
		
		// Check imbalance node => return -1 for imbalance
		// if |h1 - h2| > 1 => this node is imbalance
		// or if any of h1 or h2 = -1 (because of above condition) => child node is imbalance
		if (Math.abs(h1-h2) > 1 || h1 == -1 || h2 == -1) {
			return -1;
		}
		
		// Calculate height
		return Math.max(h1, h2) + 1;
	}
	
	// ====== Find imbalance node ====== //
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
