package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月25日 上午10:35:05
 */

public class Solution583 {
	public static void main(String[] args) {
		System.out.println(minDistance("acghes", "hteacher"));
	}

	private static int minDistance(String word1, String word2) {
		char[] cs1 = word1.toCharArray(), cs2 = word2.toCharArray();
		int[][] lcs = new int[cs1.length + 1][cs2.length + 1];
		for (int i = 0; i < cs1.length + 1; i++)
			for (int j = 0; j < cs2.length + 1; j++)
				if (i == 0 || j == 0)
					lcs[i][j] = 0;
				else
					lcs[i][j] = (cs1[i - 1] == cs2[j - 1]) ? lcs[i - 1][j - 1] + 1
							: Math.max(lcs[i - 1][j], lcs[i][j - 1]);
		return cs1.length + cs2.length - 2 * lcs[cs1.length][cs2.length];
	}
}
