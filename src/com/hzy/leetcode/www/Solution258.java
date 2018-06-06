package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月20日 下午3:41:54
 */

public class Solution258 {
	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}

	private static int addDigits(int num) {
		return num % 9 == 0 ? (num == 0 ? 0 : 9) : num % 9;
	}
}
