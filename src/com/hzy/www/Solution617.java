package com.hzy.www;

public class Solution617 {

	public static void main(String[] args) {
		TreeNode617 t10 = new TreeNode617(1);
		TreeNode617 t11 = new TreeNode617(3);
		TreeNode617 t12 = new TreeNode617(2);
		TreeNode617 t13 = new TreeNode617(5);
		t10.left = t11;t10.right=t12;t11.left=t13;
		
		TreeNode617 t20 = new TreeNode617(2);
		TreeNode617 t21 = new TreeNode617(1);
		TreeNode617 t22 = new TreeNode617(3);
		TreeNode617 t23 = new TreeNode617(4);
		TreeNode617 t24 = new TreeNode617(7);
		t20.left = t21;t20.right=t22;t21.right=t23;t22.right=t24;
		
		TreeNode617 newTree = mergeTrees(t10, t20);
		display(newTree);
	}

	private static void display(TreeNode617 newTree) {
		if (newTree == null) {
			System.out.println("null");
			return;
		}
		else {
			System.out.println(newTree.val);
			display(newTree.left);
			display(newTree.right);
		}
	}

	public static TreeNode617 mergeTrees(TreeNode617 t1, TreeNode617 t2) {
		if (t1 == null && t2 == null)
			return null;
		TreeNode617 newTree = null;
		if (t1 != null || t2 != null) {
			if (t1 == null) {
				newTree = new TreeNode617(t2.val);
				newTree.left = mergeTrees(null, t2.left);
				newTree.right=mergeTrees(null, t2.right);
			}else if (t2==null) {
				newTree = new TreeNode617(t1.val);
				newTree.left = mergeTrees(t1.left, null);
				newTree.right=mergeTrees(t1.right, null);
			}else {
				newTree = new TreeNode617(t1.val+t2.val);
				newTree.left = mergeTrees(t1.left, t2.left);
				newTree.right=mergeTrees(t1.right, t2.right);
			}
		}
		return newTree;
	}
}

class TreeNode617 {
	int val;
	TreeNode617 left;
	TreeNode617 right;

	TreeNode617(int x) {
		val = x;
		left = null;
		right = null;
	}
}
