package com.hzy.www;

import java.util.HashMap;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月16日 上午9:54:26
 */

public class Solution500 {
	public static void main(String[] args) {
		String[] strs = { "Hello", "Alaska", "Dad", "Peace" };
		for (String str : findWords(strs))
			System.out.println(str);
	}

	private static String[] findWords(String[] words) {
		HashMap<Character, Integer> alp = new HashMap<Character, Integer>();
		alp.put('q', 1);
		alp.put('w', 1);
		alp.put('e', 1);
		alp.put('r', 1);
		alp.put('t', 1);
		alp.put('y', 1);
		alp.put('u', 1);
		alp.put('i', 1);
		alp.put('o', 1);
		alp.put('p', 1);
		alp.put('a', 2);
		alp.put('s', 2);
		alp.put('d', 2);
		alp.put('f', 2);
		alp.put('g', 2);
		alp.put('h', 2);
		alp.put('j', 2);
		alp.put('k', 2);
		alp.put('l', 2);
		alp.put('z', 3);
		alp.put('x', 3);
		alp.put('c', 3);
		alp.put('v', 3);
		alp.put('b', 3);
		alp.put('n', 3);
		alp.put('m', 3);

		int level, index, res;
		for (index = 0, res = 0; index < words.length; index++) {
			level = alp.get(Character.toLowerCase(words[index].charAt(0)));
			int i;
			for (i = 1; i < words[index].length(); i++) {
				if (alp.get(Character.toLowerCase(words[index].charAt(i))) != level)
					break;
			}
			if (i == words[index].length()) {
				words[res] = words[index];
				res++;
			}
		}
		String[] strs = new String[res];
		System.arraycopy(words, 0, strs, 0, res);
		return strs;
	}
}
