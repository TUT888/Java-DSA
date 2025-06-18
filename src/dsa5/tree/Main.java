package dsa5.tree;

public class Main {
	public static void main(String[] args) {
		// Init tree
		//      0
		//    /   \
		//   10   11
		//  /  \   
		// 20  22
		MyTree tree = new MyTree(new MyNode(0));
		tree.root.children.add(new MyNode(10));
		tree.root.children.add(new MyNode(11));
		tree.root.children.get(0).children.add(new MyNode(20));
		tree.root.children.get(0).children.add(new MyNode(22));

		// Print tree nodes
		printNode(tree.root);
		printNode(tree.root.children.get(0));
		printNode(tree.root.children.get(1));
		
		// Find node
		int target = 0;
		MyNode node = tree.findNodeBFS(target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		node = tree.findNodeDFS(tree.root, target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		
		target = 10;
		node = tree.findNodeBFS(target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		node = tree.findNodeDFS(tree.root, target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		
		target = 20;
		node = tree.findNodeBFS(target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		node = tree.findNodeDFS(tree.root, target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		
		target = 22;
		node = tree.findNodeBFS(target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		node = tree.findNodeDFS(tree.root, target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));

		target = 11;
		node = tree.findNodeBFS(target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		node = tree.findNodeDFS(tree.root, target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		
		target = 21;
		node = tree.findNodeBFS(target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
		node = tree.findNodeDFS(tree.root, target);
		System.out.println("Found node: " + node + " -> value: " + (node!=null ? node.value : ""));
	}
	
	public static void printNode(MyNode node) {
		System.out.println("Node: " + node.value);
		
		System.out.print("Children: ");
		for (MyNode childNode : node.children) {
			System.out.print(childNode.value + " ");
		}
		System.out.println();
	}
}
