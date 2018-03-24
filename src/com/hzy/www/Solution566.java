package com.hzy.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月17日 上午10:57:34
 */

public class Solution566 {
	public static void main(String[] args) {
		int nums[][] = { { 1, 2 }, { 3, 4 } };
		int[][] res = matrixReshape(nums, 1, 4);
		for (int i = 0; i < res.length; i++)
			for (int j = 0; j < res[0].length; j++)
				System.out.println(res[i][j]);
	}

	/*
	 * private static int[][] matrixReshape(int[][] nums, int r, int c) { int _r =
	 * nums.length, _c = nums[0].length; int size = _r * _c; if (size != r * c)
	 * return nums; int i, j, _i, _j; int[][] res = new int[r][c]; for (int k = 0; k
	 * < size; k++) { i = k / c; j = k % c; _i = k / _c; _j = k % _c; res[i][j] =
	 * nums[_i][_j]; } return res; }
	 */

	private static int[][] matrixReshape(int[][] nums, int r, int c) {
		int _r = nums.length, _c = nums[0].length;
		if (_r * _c != r * c)
			return nums;
		int _i = 0, _j = 0;
		int res[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (_j >= _c) {
					_j = 0;
					_i++;
				}
				res[i][j] = nums[_i][_j];
				_j++;
			}
		}
		return res;
	}

}
