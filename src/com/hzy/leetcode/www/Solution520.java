package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月19日 下午9:11:31
 */

public class Solution520 {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("FlaG"));
	}

	private static boolean detectCapitalUse(String word) {
		if (word.length() == 1)
			return true;
		char[] cs = word.toCharArray();
		if (Character.isLowerCase(cs[0])) {
			for (int i = 1; i < cs.length; i++) {
				if (!Character.isLowerCase(cs[i]))
					return false;
			}
			return true;
		}
		if (word.length() == 2)
			return true;
		if (Character.isUpperCase(cs[1])) {
			for (int i = 2; i < cs.length; i++)
				if (Character.isLowerCase(cs[i]))
					return false;
			return true;
		}
		for (int i = 2; i < cs.length; i++)
			if (Character.isUpperCase(cs[i]))
				return false;
		return true;
		
//		int cnt = 0;
//        for(char c: word.toCharArray()) if('Z' - c >= 0) cnt++;
//        return ((cnt==0 || cnt==word.length()) || (cnt==1 && 'Z' - word.charAt(0)>=0));
	}
}
