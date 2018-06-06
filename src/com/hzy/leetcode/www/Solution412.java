package com.hzy.leetcode.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月16日 下午2:57:17
 */

public class Solution412 {
	public static void main(String[] args) {
		List<String> res = fizzBuzz(15);
		for (String str : res)
			System.out.println(str);
	}

	private static List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<String>();
		int j = 0, k = 0;
		String subRes = null;
		for (int i = 1; i <= n; i++) {
			j++;
			k++;
			subRes = "";
			if (j == 3 || k == 5) {
				if (j == 3) {
					subRes += "Fizz";
					j = 0;
				}
				if (k == 5) {
					subRes += "Buzz";
					k = 0;
				}
			} else
				subRes += i;
			res.add(subRes);
		}
		return res;
	}
}
