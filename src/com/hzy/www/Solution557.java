package com.hzy.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月15日 下午3:20:46
 */

public class Solution557 {
	public static void main(String[] args) {
		System.out.println(reverseWords2("Let's take LeetCode contest"));
	}

	public static String reverseWords2(String s) {
		char[] chars = s.toCharArray();
		int index;
		for (int i = 0; i < chars.length; i += index) {
			index = s.indexOf(' ', i);
			if (index == -1) {
				reverse(chars, 0, chars.length-1);
				break;
			}
			reverse(chars, i, index-1);
		}
		return new String(chars);
	}

	private static void reverse(char[] chars, int head, int tail) {
		int mid = (head + tail) / 2;
		char tmp;
		for (int i = 0; head + i <= mid; i++) {
			if (chars[head + i] != chars[tail - i]) {
				tmp = chars[head + i];
				chars[head + i] = chars[tail - i];
				chars[tail - i] = tmp;
			}
		}
	}

	public static String reverseWords(String s) {
		String[] ss = s.split(" ");
		String res = "";
		for (int i = 0; i < ss.length; i++) {
			res += (reverseString(ss[i]) + " ");
		}
		return res.substring(0, res.length() - 1);
	}

	private static String reverseString(String string) {
		final int len = string.length() - 1;
		final int MID = (string.length() - 1) / 2;
		char tmp;
		char[] cs = string.toCharArray();
		for (int i = 0; i <= MID; i++) {
			if (cs[i] != cs[len - i]) {
				tmp = cs[i];
				cs[i] = cs[len - i];
				cs[len - i] = tmp;
			}
		}
		return new String(cs);
	}

}
