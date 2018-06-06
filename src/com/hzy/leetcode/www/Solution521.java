package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version ����ʱ�䣺2018��3��19�� ����5:01:50
 */

public class Solution521 {
	public static void main(String[] args) {
		System.out.println(findLUSlength("aefawfawfawfaw", "aefawfeawfwafwaef"));
	}

	private static int findLUSlength(String a, String b) {
		if (a.length() == b.length())
			return a.equals(b) ? a.length() : -1;
		return Math.max(a.length(), b.length());
	}
}
