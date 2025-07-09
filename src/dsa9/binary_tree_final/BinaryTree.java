package dsa9.binary_tree_final;

import java.util.ArrayList;

public class BinaryTree {
	Node root;

	// ====== Rebuild tree ====== //
	public void rebuild() {
		if (root == null) return;
		
		// Extract nodes
		ArrayList<Node> nodeList = new ArrayList<Node>();
		nodeList.add(root);
		int i = 0;
		while (i < nodeList.size()) {
			Node currentNode = nodeList.get(i);

			if (currentNode.left != null) nodeList.add(currentNode.left);
			if (currentNode.right != null) nodeList.add(currentNode.right);
			
			i += 1;
		}
		
		// Rebuild
		root = null;
		for (Node node : nodeList) {
			if (root == null) {
				root = new Node(node.value);
				continue;
			}
			insertNode(root, node.value);
			balanceTreeRecursion(null, root);
		}
	}
	
	public Node insertNode(Node node, int value) {
		if (node == null) return new Node(value);
		
		if (value < node.value) {
			node.left = insertNode(node.left, value);
		} else {
			node.right = insertNode(node.right, value);
		}
		
		return node;
	}
	
	// ====== Balance Tree ====== //
	public void balanceTree() {
		int h = getHeight();
		int N = getSize();
		
		int log2N = (int) (Math.log(N) / Math.log(2));
		if (h >= 2*log2N) {
			rebuild();
		} else {
			balanceTreeRecursion(null, root);
		}
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
	
	// ====== Check balance ====== //
	public boolean isBalance() {
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


	// ====== Get size ====== //
	public int getSize() {
		return size(root);
	}
	
	public int size(Node node) {
		if (node == null) return 0;
		return size(node.left) + size(node.right) + 1;
	}

	// ====== Get height ====== //
	public int getHeight() {
		return height(root);
	}
	
	public int height(Node node) {
		if (node == null) return -1;
		return Math.max(height(node.left), height(node.right)) + 1;
	}
	
	// ====== Print Tree ====== //
	public void printTreeBFS() {
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
