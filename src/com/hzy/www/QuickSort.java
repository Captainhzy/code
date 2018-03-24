package com.hzy.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月14日 下午2:24:34
 */

public class QuickSort {
	public static void main(String[] args) {
		int num[] = { 1,1 };
		quick_sort(num, 0, num.length - 1);
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i]);
		System.out.println("-------------");
		// System.out.println(arrayPairSum(num));
	}

	public static int arrayPairSum(int[] nums) {
		int sum = 0;
		quick_sort(nums, 0, nums.length - 1);
		for (int i = 0; i < nums.length - 1; i += 2)
			sum += nums[i];
		return sum;
	}

	private static void quick_sort(int[] num, int left, int right) {
		if (left > right)
			return;
		int _left = left, _right = right;
		int tmp = num[left];
		while (left < right) {
			while (num[right] > tmp && left < right)
				right--;
			num[left] = num[right];
			while (num[left] <= tmp && left < right)
				left++;
			num[right] = num[left];
		}
		num[left] = tmp;
		quick_sort(num, _left, left - 1);
		quick_sort(num, right + 1, _right);
	}
}
