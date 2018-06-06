package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月19日 下午8:48:09
 */

public class Solution485 {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	private static int findMaxConsecutiveOnes(int[] nums) {
		int len = nums.length, res = 0, record = 0;
		for (int i = 0; i < len; i++) {
			record ++;
			if (nums[i] == 0)
				record = 0;
			res = res >= record ? res : record;
		}
		return res;
	}
}
