package com.hzy.www;

import java.util.ArrayList;
import java.util.List;

public class Solution728 {
	public static void main(String[] args) {
		List<Integer> list = selfDividingNumbers(47, 85);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<Integer>();
		for(int i=left; i<=right; i++) {
			if(isSelfDividingNumber(i))
				res.add(i);
		}
		return res;
	}

	private static boolean isSelfDividingNumber(int i) {
		int split, num = i;
		while(num!=0) {
			split = num % 10;
			if(split==0 || i%split!=0)
				return false;
			num/=10;
		}
		return true;
	}
}
