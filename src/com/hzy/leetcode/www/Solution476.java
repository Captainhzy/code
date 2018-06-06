package com.hzy.leetcode.www;

public class Solution476 {
	public static void main(String[] args) {
		System.out.println(findComplement(-5));
	}

	public static int findComplement(int num) {
		int res;
		int count = 0, _num = num;
		while (_num != 0 && _num != -1) {
			_num = _num >> 1;
			count++;
		}
		res = (~num) & ((1 << count) - 1);
		return res;
	}
}
