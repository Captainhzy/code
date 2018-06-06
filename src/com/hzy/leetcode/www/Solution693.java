package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月19日 下午5:28:05
 */

public class Solution693 {
	public static void main(String[] args) {
		System.out.println(hasAlternatingBits(11));
		int a = 1431655766;
		System.out.println(Integer.toBinaryString(a));
		int b = a << 1;
		System.out.println(Integer.toBinaryString(b));
		int num = (a + b) >> 1;
		System.out.println(Integer.toBinaryString(a+b));
		System.out.println(Integer.toBinaryString(num));
	}

	private static boolean hasAlternatingBits(int n) {
		int num = ((n << 1) ^ n) >> 1;
		return (num & (num + 1)) == 0;
	}
}
