package data_structures.binary_search_tree;

import java.util.ArrayList;

public class BinaryTree {
	Node root;
	
	// ====== Get height ====== //
	public int getHeight() {
		return height(root);
	}
	
	public int height(Node node) {
		if (node == null) return -1;
		return Math.max(height(node.left), height(node.right)) + 1;
	}
		
	// ====== Check balance ====== //
	public boolean isBalance() {
		return checkBalanceWithHeight(root) != -1;
	}
	
	public int checkBalanceWithHeight(Node node) {
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
	
	// ====== Find imbalance node ====== //
	public ArrayList<Node> findImbalanceNode() {
		ArrayList<Node> result = new ArrayList<Node>();
		findImbalanceWithHeight(result, root);
		
		return result;
	}
	
	public int findImbalanceWithHeight(ArrayList<Node> nodeList, Node node) {
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
