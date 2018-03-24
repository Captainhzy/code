package com.hzy.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月19日 下午8:59:00
 */

public class Solution226 {
	public static void main(String[] args) {
		System.out.println(invertTree(null));
	}

	private static TreeNode226 invertTree(TreeNode226 root) {
		if (root != null) {
			TreeNode226 tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			root.left = invertTree(root.left);
			root.right = invertTree(root.right);
		}
		return root;
	}
}

class TreeNode226 {
	int val;
	TreeNode226 left;
	TreeNode226 right;

	TreeNode226(int x) {
		val = x;
	}
}