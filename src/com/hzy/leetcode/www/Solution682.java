package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月17日 上午10:14:01
 */

public class Solution682 {
	public static void main(String[] args) {
		String[] ops = { "-60", "D", "-36", "30", "13", "C", "C", "-33", "53", "79" };
		System.out.println(calPoints(ops));
	}

	private static int calPoints(String[] ops) {
		int res = 0;
		int len = ops.length;
		for (int i = 0; i < len; i++) {
			if ("+".equals(ops[i])) {
				int j = i - 1;
				while (ops[j] == null)
					j--;
				int k = j - 1;
				while (ops[k] == null)
					k--;
				ops[i] = (Integer.parseInt(ops[j]) + Integer.parseInt(ops[k])) + "";
				res += Integer.parseInt(ops[i]);
			} else if ("D".equals(ops[i])) {
				int j = i - 1;
				while (ops[j] == null)
					j--;
				ops[i] = Integer.parseInt(ops[j]) * 2 + "";
				res += Integer.parseInt(ops[i]);
			} else if ("C".equals(ops[i])) {
				ops[i] = null;
				int j = i - 1;
				while (ops[j] == null)
					j--;
				res = res - Integer.parseInt(ops[j]);
				ops[j] = null;
			} else {
				res += Integer.parseInt(ops[i]);
			}
		}
		return res;
	}
}
