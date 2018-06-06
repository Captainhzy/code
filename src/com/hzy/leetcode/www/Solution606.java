package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月24日 上午9:24:12
 */

public class Solution606 {
	public static void main(String[] args) {

	}

	private static String tree2str(TreeNode617 t) {
		if (t == null)
			return "";
		String res = "" + t.val;

		if (t.right != null)
			res += "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
		else if (t.left != null)
			res += "(" + tree2str(t.left) + ")";
		return res;
	}
}

class TreeNode606 {
	int val;
	TreeNode606 left;
	TreeNode606 right;

	public TreeNode606(int val) {
		this.val = val;
	}
}
