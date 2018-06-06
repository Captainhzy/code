package com.hzy.leetcode.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月21日 下午4:43:01
 */

public class Solution448 {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> ans = findDisappearedNumbers(nums);
		for(int n: ans)
			System.out.println(n);
	}

	private static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		int len = nums.length;
		int[] count = new int[len + 1];
		for (int i = 0; i < len; i++)
			count[nums[i]]++;
		for (int i = 1; i < len + 1; i++)
			if (count[i] == 0)
				res.add(i);
		return res;
	}
}
