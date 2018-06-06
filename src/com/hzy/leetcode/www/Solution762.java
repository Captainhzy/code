package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月19日 下午8:16:55
 */

public class Solution762 {
	public static void main(String[] args) {
		System.out.println(countPrimeSetBits(10, 15));
	}

	private static int countPrimeSetBits(int L, int R) {
		int count = 0;
		int num;
		for (int i = L; i <= R; i++) {
			num = i;
			int record = 0;
			while (num != 0) {
				record += (num & 1);
				num >>= 1;
			}
			if (isPrim(record))
				count++;
		}
		return count;
	}

	private static boolean isPrim(int record) {
		if (record == 0 || record == 1)
			return false;
		if (record == 2 || record == 3)
			return true;
		for (int i = 2; i <= Math.sqrt(record); i++) {
			if (record % i == 0)
				return false;
		}
		return true;
	}
}
