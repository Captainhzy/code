package com.hzy.leetcode.www;

import java.util.List;

/**
 * @author Captainhzy E-mail:1544292143@qq.com
 * @version ����ʱ�䣺2018��3��21�� ����2:03:33
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