package com.hzy.www;

public class Solution771 {
	public static void main(String[] args) {
		try {
			String J, S;
			int count = 0;
			byte[] j = new byte[1024];
			int jLen = System.in.read(j);
			J = new String(j, 0, jLen-2);
			byte[] s = new byte[1024];
			int sLen = System.in.read(s);
			S = new String(s, 0, sLen-2);
			
			
			for(int i=0; i<S.length(); i++) {
				if (oneOfJ(S.charAt(i), J)) 
					count ++;
			}
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean oneOfJ(char index, String J) {
		for(int i=0; i<J.length(); i++)
			if (index == J.charAt(i))
				return true;
		return false;
	}
}
