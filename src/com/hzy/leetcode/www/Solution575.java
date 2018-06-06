package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月17日 上午9:43:23
 */

public class Solution575 {
	public static void main(String[] args) {
		int[] num = { 1, 1, 2, 3 };
		System.out.println(distributeCandies(num));
	}

	private static int distributeCandies(int[] candies) {
		int len = candies.length, kinds = 0;
		int[] sorts = new int[200001];
		for (int i = 0; i < len; i++)
			sorts[candies[i] + 100000]++;
		for (int index = 0; kinds < len / 2 && index < 200001; index++) {
			if (sorts[index] != 0) {
				kinds++;
			}
		}
		return kinds;
	}
}
