package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月24日 上午11:23:04
 */

public class Solution793 {
	public static void main(String[] args) {
		System.out.println(preimageSizeFZF(5));
	}

	private static int preimageSizeFZF(int K) {
		if (K < 5)
			return 5;
		int part = 1;
		while (part * 5 + 1 < K)
			part = part * 5 + 1;
		if (K / part == 5)
			return 0;
		return preimageSizeFZF(K % part);
	}
}
