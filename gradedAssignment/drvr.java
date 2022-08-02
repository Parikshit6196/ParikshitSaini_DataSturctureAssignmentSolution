package com.gradedAssignment;

import com.gradedAssignment.binarySkew.Node;

public class drvr {
public static void main(String[] args) {
		
		binarySkew tree = new binarySkew();
		
		tree.node = new com.gradedAssignment.binarySkew.Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
		tree.BinaryTreeToSkewed(tree.node);
		tree.traverseSkewed(tree.headnode);
		
	}
}
