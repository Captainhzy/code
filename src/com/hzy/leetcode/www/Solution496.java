package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version ����ʱ�䣺2018��3��18�� ����10:07:19
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
	 * = nums[0]; //�ҵ�nums������ֵ for (int i = 1; i < Length; i++) { if (nums[i] >
	 * max) { max = nums[i]; } } int[] Indexer = new int[max + 1]; for (int i = 0; i
	 * < Length; i++) { //ͨ��һ���µ����飬��ԭ�����ֵ��Ϊ������ԭ�����������Ϊֵ��
	 * //�������Ժܷ�����ҵ�ָ������Ԫ�ص��±ֻ꣬��Ҫһ��ѭ�����ɣ�����д��findNums //���ж���Ԫ�أ�����Ҫ���ٴ�ѭ����Ч�ʺܵ͡� ������Ҫѧϰ
	 * Indexer[nums[i]] = i; } boolean Found = false; int cur, curindex; for (int i
	 * = 0; i < findLength; i++) {
	 * 
	 * cur = findNums[i]; //�ҵ���Ҫ����������ֵ curindex = Indexer[cur] + 1; //��ʼ��Ϊ-1
	 * Final[i] = -1; //�жϵ�ǰֵ�Ƿ������ֵ����������ֵ���Ͳ������ˣ�����д��û�д����жϣ�Ч�ʵ��� if (cur != max) {
	 * //����Ѿ��ҵ�����cur��ֵ���Ͳ��������ˣ���Found���п��� while (curindex < Length) { if
	 * (nums[curindex] > cur) {
	 * 
	 * Final[i] = nums[curindex]; curindex = Length; } curindex++; } } } return
	 * Final; }
	 */
}
