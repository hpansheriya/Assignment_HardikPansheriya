package logic;

import java.util.StringTokenizer;

public class Calculation
{
	public static int findMax(int arr[]) {
		int max = 0;
		for(int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static String reverseString(String str) {
		StringBuilder rs = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(str,"");
		
		while(st.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			sb.append(st.nextToken());
			sb.reverse();
			
			rs.append(sb);
			rs.append(" ");
		}
		return rs.toString();
	}
}
