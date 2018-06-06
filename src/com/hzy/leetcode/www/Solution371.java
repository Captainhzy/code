package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月22日 下午2:59:21
 */

public class Solution371 {
	public static void main(String[] args) {
		System.out.println(getSum(12, 13));
	}

	private static int getSum(int a, int b) {
		while(b!=0) {
			int fontBit = a&b;
			a=a^b;
			b=fontBit<<1;
		}
		return a;
	}
}
