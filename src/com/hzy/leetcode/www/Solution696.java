package com.hzy.leetcode.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月22日 下午3:45:45
 */

public class Solution696 {
	public static void main(String[] args) {
		System.out.println(countBinarySubstrings("0011100110"));
	}

	private static int countBinarySubstrings(String s) {
		int res = 0;
		char[] cs = s.toCharArray();
		List<Integer> record = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < cs.length; i++) {
			count++;
			if (i == cs.length - 1) {
				record.add(count);
				break;
			}
			if (cs[i] != cs[i + 1]) {
				record.add(count);
				count = 0;
			}
		}
		for (int i = 0; i < record.size() - 1; i++) {
			res += Math.min(record.get(i), record.get(i + 1));
		}
		return res;
	}
}
