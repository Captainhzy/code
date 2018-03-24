package com.hzy.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月19日 下午8:37:02
 */

public class Solution104 {
	public static void main(String[] args) {
		System.out.println(maxDepth(null));
	}

	private static int maxDepth(TreeNode104 root) {
		Queue<TreeNode104> queue = new LinkedList<>();
		queue.add(root);
		int res = 0, size;
		while (!queue.isEmpty()) {
			res++;
			size = queue.size();
			TreeNode104 tmp;
			for (int i = 0; i < size; i++) {
				tmp = queue.poll();
				if (tmp.left != null)
					queue.add(tmp.left);
				if (tmp.right != null)
					queue.add(tmp.right);
			}
		}
		return res;
	}
}

class TreeNode104 {
	int val;
	TreeNode104 left;
	TreeNode104 right;

	TreeNode104(int x) {
		val = x;
	}
}