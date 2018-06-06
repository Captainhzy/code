package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月18日 上午10:07:19
 */

public class Solution496 {
	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 }, nums2 = { 1, 3, 4, 2 };
		nums1 = nextGreaterElement(nums1, nums2);
		for (int i : nums1)
			System.out.println(i);
	}

	private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int len1 = nums1.length, len2 = nums2.length;
		int j;
		for (int i = 0; i < len1; i++) {
			j = 0;
			while (nums2[j++] != nums1[i])
				;
			while (j < len2 && nums2[j] <= nums1[i])
				j++;
			if (j < len2)
				nums1[i] = nums2[--j];
			else
				nums1[i] = -1;
		}
		return nums1;
	}

	/*
	 * public int[] nextGreaterElement(int[] findNums, int[] nums) { if (nums ==
	 * null || nums.length == 0) { return new int[]{}; } int Length = nums.length;
	 * int findLength = findNums.length; int[] Final = new int[findLength]; int max
	 * = nums[0]; //找到nums中最大的值 for (int i = 1; i < Length; i++) { if (nums[i] >
	 * max) { max = nums[i]; } } int[] Indexer = new int[max + 1]; for (int i = 0; i
	 * < Length; i++) { //通过一个新的数组，将原数组的值作为索引，原数组的索引作为值，
	 * //这样可以很方便的找到指定数组元素的下标，只需要一次循环即可，而我写的findNums //中有多少元素，就需要多少次循环，效率很低。 这里需要学习
	 * Indexer[nums[i]] = i; } boolean Found = false; int cur, curindex; for (int i
	 * = 0; i < findLength; i++) {
	 * 
	 * cur = findNums[i]; //找到需要遍历的索引值 curindex = Indexer[cur] + 1; //初始化为-1
	 * Final[i] = -1; //判断当前值是否是最大值，如果是最大值，就不用找了，而我写的没有此类判断，效率低下 if (cur != max) {
	 * //如果已经找到大于cur的值，就不用再找了，用Found进行控制 while (curindex < Length) { if
	 * (nums[curindex] > cur) {
	 * 
	 * Final[i] = nums[curindex]; curindex = Length; } curindex++; } } } return
	 * Final; }
	 */
}
