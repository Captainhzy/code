package com.hzy.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月21日 下午4:57:25
 */

public class Solution788 {
	private static int[] pow7 = { 1, 2, 3, 3, 3, 4, 5, 5, 6, 7 };
	private static int[] pow3 = { 1, 2, 2, 2, 2, 2, 2, 2, 3, 3 };

	public static void main(String[] args) {
		int n = 829;
		System.out.println(rotatedDigits(n));
		System.out.println(rotatedDigits2(n));
	}

	private static int rotatedDigits2(int N) {
		if (N == 0)
			return 0;
		int count = (int) Math.log10(N);
		int first = N / (int) Math.pow(10, count);
		int res = 0;
		if (N == 2 || N == 5 || N == 6 || N == 9)
			return pow7[N] - pow3[N];
		if (first == 0 || first == 1 || first == 8)
			res += rotatedDigits2(N % (int) Math.pow(10, count));
		if (first == 2 || first == 5 || first == 6 || first == 9)
			res += rotatedDigits0(N % (int) Math.pow(10, count));
		res += (int) (pow7[first - 1] * Math.pow(7, count) - pow3[first - 1] * Math.pow(3, count));
		return res;
	}

	private static int rotatedDigits0(int N) {
		if (N == 0 || N == 1 || N == 2 || N == 5 || N == 6 || N == 8 || N == 9)
			return pow7[N];
		int count = (int) Math.log10(N);
		int first = N / (int) Math.pow(10, count);
		int res = (int) (pow7[first - 1] * Math.pow(7, count));
		if (first == 0 || first == 1 || first == 8 || first == 2 || first == 5 || first == 6 || first == 9)
			res += rotatedDigits0(N % (int) Math.pow(10, count));
		return res;
	}

	private static int rotatedDigits(int N) {
		if (N == 1)
			return 0;
		int count = 0;
		for (int i = 2; i <= N; i++) {
			if (isNumRight(i))
				count++;
		}
		return count;
	}

	private static boolean isNumRight(int num) {
		int[] record = new int[3];
		List<Integer> ns = new ArrayList<>();
		do
			ns.add(num % 10);
		while ((num /= 10) != 0);
		for (int n : ns)
			record[isDigitRight(n)]++;
		if (record[0] != 0)
			return false;
		if (record[2] == ns.size())
			return false;
		else
			return true;
	}

	private static int isDigitRight(int n) {
		if (n == 2 || n == 5 || n == 6 || n == 9)
			return 1;
		else if (n == 1 || n == 0 || n == 8)
			return 2;
		else
			return 0;
	}

}
