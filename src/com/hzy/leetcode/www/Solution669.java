package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月16日 上午11:26:55
 */

public class Solution669 {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(0);
		TreeNode t3 = new TreeNode(4);
		TreeNode t4 = new TreeNode(2);
		TreeNode t5 = new TreeNode(1);
		t1.left = t2;
		t1.right = t3;
		t2.right = t4;
		t4.left = t5;
		displayTree(trimBST(t1, 1, 2));
	}

	private static void displayTree(TreeNode t1) {
		if (t1 != null) {
			displayTree(t1.left);
			System.out.println(t1.val);
			displayTree(t1.right);
		}

	}

	private static TreeNode trimBST(TreeNode root, int L, int R) {
		if (root != null)
			if (root.val < L) {
				root = trimBST(root.right, L, R);
			} else if (root.val > R) {
				root = trimBST(root.left, L, R);
			} else {
				root.left = trimBST(root.left, L, R);
				root.right = trimBST(root.right, L, R);
			}
		return root;
	}

}

class TreeNode {
	int val;
	TreeNode left = null;
	TreeNode right = null;

	TreeNode(int x) {
		val = x;
	}
}
