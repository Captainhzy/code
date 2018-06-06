package com.hzy.leetcode.www;

import java.util.List;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version 创建时间：2018年3月21日 下午2:03:33
 */

public class Solution690 {
	public static void main(String[] args) {
		System.out.println(getImportance(null, 0));
	}

	private static int getImportance(List<Employee> employees, int id) {
		int res = 0;
		Employee e = null;
		for (int i = 0; (e = employees.get(i)).id != id; i++)
			;
		res += e.importance;
		List<Integer> subes = e.subordinates;
		for (int subid : subes) {
			res += getImportance(employees, subid);
		}
		return res;
	}
}

class Employee {
	public int id;
	public int importance;
	public List<Integer> subordinates;
}