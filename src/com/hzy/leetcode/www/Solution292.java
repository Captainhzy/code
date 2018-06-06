package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月19日 下午7:51:14
 */

public class Solution292 {
	public static void main(String[] args) {
		System.out.println(canWinNim(4));
	}

	private static boolean canWinNim(int n) {
		System.out.println(8&3);
		return (n & 3) == 0 ? false : true;
	}
}
