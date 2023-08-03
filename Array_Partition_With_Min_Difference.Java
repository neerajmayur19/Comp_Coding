import java.util.* ;
import java.io.*; 
public class Solution {
	public static int minSubsetSumDifference(int[] arr, int n) {
		// Write your code here.
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
		}
		boolean[][] dp = new boolean[n][sum+1];
		for(int i=0;i<n;i++)
		dp[i][0] = true;
		if(arr[0]<=sum)
		dp[0][arr[0]] = true;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				boolean npick = dp[i-1][j];
				boolean pick = false;
				if(arr[i]<=j)
				pick = dp[i-1][j-arr[i]];
				dp[i][j] = pick|npick;
			}
		}
		return solve(dp,sum);
	}
	public static int solve(boolean[][] dp, int sum)
	{
		int min = Integer.MAX_VALUE;
		for(int i=0;i<=sum;i++)
		{
			if(dp[dp.length-1][i] == true)
			{
				min = Math.min(min, Math.abs(i-(sum-i)));
			}
		}
		return min;
	}

}
