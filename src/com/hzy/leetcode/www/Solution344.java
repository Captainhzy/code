package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月15日 下午2:43:21
 */

public class Solution344 {
	public static void main(String[] args) {
		System.out.println(reverseString("a ba"));
	}

	public static String reverseString(String s) {
		char[] c;
		c = s.toCharArray();
		int i = 0, j = s.length() - 1;
		char tmp;
		while (i < j) {
			if (c[i] != c[j]) {
				tmp = c[j];
				c[j] = c[i];
				c[i] = tmp;
			}
			i++;
			j--;
		}
		return new String(c);
	}
}
