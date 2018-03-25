package com.hzy.www;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月25日 上午10:04:25
 */

public class Solution507 {
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(6));
	}

	private static boolean checkPerfectNumber(int num) {
		int sum = 1;
		int bound = (int) Math.sqrt(num);
		for (int i = 2; i <= bound; i++)
			if (num % i == 0)
				if (i == bound && i * i == sum)
					sum += i;
				else
					sum += (i + (num / i));
		 return sum == num;
		 
		 
		 
//		if (num <= 1)
//			return false;
//		int sum = 0;
//		int num1 = 0;
//		num1 = (num + 1) / 2;
//		while (num1 >= 1) {
//			if (num % num1 == 0) {
//				sum += num1;
//			}
//			if (num1 == 1)
//				break;
//			num1 = (num1 + 1) / 2;
//		}
//		return sum == num;

	}
}
