package com.hzy.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月20日 下午4:16:26
 */

public class Solution695 {

	public static void main(String[] args) {
		/*
		 * int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0,
		 * 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1,
		 * 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
		 * { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0,
		 * 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
		 */
		int[][] grid = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 1, 1 } };
		System.out.println(maxAreaOfIsland(grid));
	}

	private static int maxAreaOfIsland(int[][] grid) {
		int maxArea = 0;
		int lenx = grid.length, leny = grid[0].length;
		for (int i = 0; i < lenx; i++) {
			for (int j = 0; j < leny; j++) {
				// if (grid[i][j] == 1) {
				// record++;
				// grid[i][j] = 0;
				// findNeighbor(grid, i, j);
				// maxArea = maxArea > record ? maxArea : record;
				// record = 0;
				// }
				maxArea = Math.max(maxArea, findNext(grid, i, j, 0));
			}
		}
		return maxArea;
	}

	// private static void findNeighbor(int[][] grid, int i, int j) {
	// if (i > 0 && grid[i - 1][j] == 1) {
	// record++;
	// grid[i - 1][j] = 0;
	// findNeighbor(grid, i - 1, j);
	// }
	// if (j > 0 && grid[i][j - 1] == 1) {
	// record++;
	// grid[i][j - 1] = 0;
	// findNeighbor(grid, i, j - 1);
	// }
	// if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
	// record++;
	// grid[i][j + 1] = 0;
	// findNeighbor(grid, i, j + 1);
	// }
	// if (i + 1 < grid.length && grid[i + 1][j] == 1) {
	// record++;
	// grid[i + 1][j] = 0;
	// findNeighbor(grid, i + 1, j);
	// }
	// }

	private static int findNext(int[][] grid, int i, int j, int score) {
		if (i == 0 || j == 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0)
			return score;
		score++;
		grid[i][j] = 0;
		return findNext(grid, i, j + 1, score) + findNext(grid, i, j - 1, score) + findNext(grid, i + 1, j, score)
				+ findNext(grid, i - 1, j, score) - 3 * score;
	}
}
