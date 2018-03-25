package com.hzy.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月22日 下午4:20:50
 */

public class Solution653 {
	public static void main(String[] args) {
		findTarget(null, 0);
	}

	private static boolean findTarget(TreeNode617 root, int k) {
		List<Integer> list = new ArrayList<>();
		recordInt(list, root);
		int sum;
		int i = 0, j = list.size() - 1;
		while (i < j) {
			sum = list.get(i) + list.get(j);
			if (sum < k)
				i++;
			else if (sum > k)
				j--;
			else
				return true;
		}
		return false;
	}

	private static void recordInt(List<Integer> list, TreeNode617 root) {
		if (root == null)
			return;
		recordInt(list, root.left);
		list.add(root.val);
		recordInt(list, root.right);
	}

}

class TreeNode653 {
	int val;
	TreeNode653 left;
	TreeNode653 right;

	public TreeNode653(int x) {
		val = x;
	}
}
