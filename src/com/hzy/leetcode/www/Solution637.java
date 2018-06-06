package com.hzy.leetcode.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月18日 上午10:37:12
 */

public class Solution637 {
	public static void main(String[] args) {
		// TreeNode637 t1 = new TreeNode637(3);
		// TreeNode637 t2 = new TreeNode637(9);
		// TreeNode637 t3 = new TreeNode637(20);
		// TreeNode637 t4 = new TreeNode637(15);
		// TreeNode637 t5 = new TreeNode637(7);
		// t1.left = t2;
		// t1.right = t3;
		// t3.left = t4;
		// t3.right = t5;
		// [2147483647,2147483647,2147483647]?
		TreeNode637 t1 = new TreeNode637(2147483647);
		TreeNode637 t2 = new TreeNode637(2147483647);
		TreeNode637 t3 = new TreeNode637(2147483647);
		t1.left = t2;
		t1.right = t3;
		List<Double> res = averageOfLevels(t1);
		for (double d : res)
			System.out.println(d);
	}

	private static List<Double> averageOfLevels(TreeNode637 root) {
		List<Double> res = new ArrayList<>();
		Map<Integer, List<Double>> records = new HashMap<>();
		int i = 0;
		cal(records, root, i);
		double vals;
		int size;
		List<Double> record = null;
		for (int j = 0; j < records.size(); j++) {
			record = records.get(j);
			vals = 0.0;
			size = record.size();
			for (double k : record)
				vals += k;
			res.add(vals/size);
		}
		return res;
	}

	private static void cal(Map<Integer, List<Double>> records, TreeNode637 root, int i) {
		if (root == null)
			return;
		if (!records.containsKey(i)) {
			List<Double> list = new ArrayList<>();
			records.put(i, list);
		}
		List<Double> record = records.get(i);
		record.add((double) root.val);
		records.put(i, record);
		cal(records, root.left, i + 1);
		cal(records, root.right, i + 1);
		return;
	}

	private static List<Double> averageOfLevels2(TreeNode637 root) {
		List<Double> res = new ArrayList<>();
		Queue<TreeNode637> queue = new LinkedList<>();
		int size;
		double sum;
		queue.add(root);
		while (!queue.isEmpty()) {
			size = queue.size();
			TreeNode637 t;
			sum=0.0;
			for (int i = 0; i < size; i++) {
				t = queue.poll();
				sum += t.val;
				if (t.left != null)
					queue.add(t.left);
				if (t.right != null)
					queue.add(t.right);
			}
			res.add(sum / size);
		}

		return res;
	}

}

class TreeNode637 {
	int val;
	TreeNode637 left = null;
	TreeNode637 right = null;

	TreeNode637(int x) {
		val = x;
	}
}