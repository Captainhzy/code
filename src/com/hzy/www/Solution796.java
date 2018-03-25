package com.hzy.www;

public class Solution796 {
	public static void main(String[] args) {
		System.out.println(rotateString("abcde", "abced"));
	}

	public static boolean rotateString(String A, String B) {
		if (A.length() != B.length())
			return false;
		boolean res = true;
		int len = A.length();
		for (int i = 0; i < len; i++) {
			res = true;
			for (int j = 0; j < len; j++)
				if (B.charAt((j + i) % len) != A.charAt(j)) {
					res = false;
					break;
				}
			if (res == true)
				break;
		}
		return res;
	}
}
