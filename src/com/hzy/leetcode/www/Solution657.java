package com.hzy.leetcode.www;

public class Solution657 {
	public static void main(String[] args) {
		System.out.println(judgeCircle("LL"));
	}

	public static boolean judgeCircle(String moves) {
		int[] position = { 0, 0 };
		char act;
		for (int i = 0; i < moves.length(); i++) {
			act = moves.charAt(i);
			switch (act) {
			case 'R':
				position[0]++;
				break;
			case 'L':
				position[0]--;
				break;
			case 'U':
				position[1]++;
				break;
			case 'D':
				position[1]--;
				break;
			default:
				break;
			}
		}
		return position[0]==0&&position[1]==0 ? true : false;
	}
}
