package com.hzy.leetcode.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月21日 下午4:08:13
 */

public class Solution389 {
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "bcdae"));
	}

	private static char findTheDifference(String s, String t) {
		int[] scount = new int[26], tcount = new int[26];
		char[] cs = s.toCharArray(), ts = t.toCharArray();
		int slen = cs.length, tlen = ts.length;

		for (int i = 0; i < slen; i++) {
			scount[cs[i]-97]++;
			tcount[ts[i]-97]++;
		}
		tcount[ts[tlen - 1]-97]++;
		for(int i=0; i<26; i++)
			if(scount[i]!=tcount[i])
				return (char)(i+97);
		return 0;
	}
}
