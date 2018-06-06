package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月17日 下午2:13:57
 */

public class Solution463 {
	public static void main(String[] args) {
		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		// int[][] grid = { { 1 } };
		System.out.println(islandPerimeter(grid));
	}

	private static int islandPerimeter(int[][] grid) {
		int res = 0;
		int r = grid.length, c = grid[0].length;
		for (int i = 0; i < r; i++) {
			res += grid[i][0] + grid[i][c - 1];
			for (int j = 1; j < c; j++) {
				res += 1 - Math.abs(1 - grid[i][j - 1] - grid[i][j]);
			}
		}
		for (int j = 0; j < c; j++) {
			res += grid[0][j] + grid[r - 1][j];
			for (int i = 1; i < r; i++) {
				res += 1 - Math.abs(1 - grid[i - 1][j] - grid[i][j]);
			}
		}
		return res;
	}
}
