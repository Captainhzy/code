package com.hzy.www;

public class Solution561 {
	public static void main(String[] args) {

	}

	public static int arrayPairSum(int[] nums) {
		int res=0;
		nums = quickSort(nums);
		for(int i=0; i<nums.length; i+=2)
			res+=nums[i];
		return res;
	}

	private static int[] quickSort(int[] nums) {
		
		return null;
	}
}
