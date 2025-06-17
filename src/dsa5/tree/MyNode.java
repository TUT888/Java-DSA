package dsa5.tree;

import java.util.ArrayList;

public class MyNode {
	Integer value;
	ArrayList<MyNode> children;
	
	public MyNode(int value) {
		this.value = value;
		this.children = new ArrayList<MyNode>();
	}
	
	public MyNode(int value, ArrayList<MyNode> childrens) {
		this.value = value;
		this.children = childrens;
	}
}
