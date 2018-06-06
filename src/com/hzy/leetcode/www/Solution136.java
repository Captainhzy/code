package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月19日 下午8:15:51
 */

public class Solution136 {
	public static void main(String[] args) {
		System.out.println(singleNumber(null));
	}

	private static int singleNumber(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[0] = nums[0] ^ nums[i];
		}
		return nums[0];
	}
}
