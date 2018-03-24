package com.hzy.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月24日 上午10:27:29
 */

public class Solution766 {
	public static void main(String[] args) {
		int[][] matrix = { { 63, 18, 62, 88, 23 }, { 49, 63, 18, 62, 88 }, { 0, 49, 63, 18, 62 }, { 2, 67, 49, 63, 18 },
				{ 50, 2, 67, 49, 63 }, { 94, 50, 2, 67, 49 } };
		System.out.println(isToeplitzMatrix(matrix));
	}

	private static boolean isToeplitzMatrix(int[][] matrix) {
		int rows = matrix.length, cols = matrix[0].length;
		for (int i = 0; i < rows - 1; i++)
			for (int j = 0; j < cols - 1; j++)
				if (matrix[i][j] != matrix[i + 1][j + 1])
					return false;
		return true;
	}

}
