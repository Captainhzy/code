package com.hzy.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月21日 下午3:38:57
 */

public class Solution283 {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		int i = 0, j = 0;
		int len = nums.length;
		while (i < len) {
			if (nums[i] != 0)
				nums[j++] = nums[i];
			i++;
		}
		do
			nums[j++] = 0;
		while (j != len);
		for (int n : nums)
			System.out.println(n);
	}
}
