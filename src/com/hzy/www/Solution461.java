package com.hzy.www;

public class Solution461 {
	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 8));
	}
	
	private static int hammingDistance(int x, int y) {
        int count = 0;
        int z = x ^ y;
        for(int i=0; i<31; i ++) {
        	if ((z&1)==1)
        		count ++;
        	z = z >> 1;
        }
		return count;
    }
}
