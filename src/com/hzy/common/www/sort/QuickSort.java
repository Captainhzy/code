package com.hzy.common.www.sort;

/*
 * ����
 * ע��1��nums[i]<=pivot���ǵ��е�Ԫ����ͬ
 * 	  2��i-1, j+1�����ϴη����еġ����ᡱ���ǵ���һ�η��Σ���ʵi��j����ȵ�
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 7, 8, 5, 2, 9, 6, 3 };
		quickSort(nums, 0, nums.length - 1);
		for (int i : nums)
			System.out.println(i);
	}

	public static void quickSort(int[] nums, int l, int r) {
		if (r < l)
			return;

		int i = l, j = r;
		int pivot = nums[l];
		while (i < j) {
			while (i < j && nums[j] > pivot)
				j--;
			nums[i] = nums[j];
			while (i < j && nums[i] <= pivot)
				i++;
			nums[j] = nums[i];
		}
		nums[i] = pivot;
		quickSort(nums, l, i - 1);
		quickSort(nums, j + 1, r);
	}
}
