package dsa5.tree;

import java.util.ArrayList;

public class MyTree {
	MyNode root;
	
	public MyTree(MyNode root) {
		this.root = root;
	}
	
	// Traverse by level
	public MyNode findNodeV1(int value) {
		if (root == null) return null;

		// For each node
		// 1. check its value
		// 2. add its children to nodeList, which will be visited later
		ArrayList<MyNode> nodeList = new ArrayList<MyNode>();
		nodeList.add(root);
		while (nodeList.size() > 0) {
			MyNode currentNode = nodeList.removeFirst();
			if (currentNode.value == value) {
				return currentNode;
			}
			// Add current node's children to list
			for (MyNode childNode : currentNode.children) {
				nodeList.add(childNode);
			}
		}
		
		return null;
	}
	
	// Traverse by depth
	public MyNode findNodeV2(MyNode currentNode, int value) {
		// Check current node
		if (currentNode == null) return null;
		if (currentNode.value == value) return currentNode;
		
		for (MyNode childNode : currentNode.children) {
			MyNode result = findNodeV2(childNode, value);
			// Only return the node if the result is not null
			// Otherwise, continue the search with next child in next loop
			if (result != null) {
				return result;
			}
		}
		
		return null;
	}
}
