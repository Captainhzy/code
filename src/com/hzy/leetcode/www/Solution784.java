package com.hzy.leetcode.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月21日 下午2:30:18
 */

public class Solution784 {
	public static void main(String[] args) {
		List<String> res = letterCasePermutation("a1b2");
		for (String s : res)
			System.out.println(s);
	}

	private static List<String> letterCasePermutation(String S) {
		Queue<String> queue = new LinkedList<>();
		queue.add(S);
		int len = S.length();
		for (int i = 0; i < len; i++) {
			int size = queue.size();
			for (int j = 0; j < size; j++)
				if (!Character.isDigit(S.charAt(i))) {
					String ss = queue.poll();
					char[] cs = ss.toCharArray();
					cs[i] = Character.toLowerCase(cs[i]);
					String slow = new String(cs);
					queue.add(slow);
					cs[i] = Character.toUpperCase(cs[i]);
					String sup = new String(cs);
					queue.add(sup);
				}
		}
		List<String> list = new ArrayList<>();
		while (!queue.isEmpty())
			list.add(queue.poll());
		return list;
	}

}
