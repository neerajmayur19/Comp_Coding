import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int[][] dp = new int[num.length+1][x+1];
        for(int i=0;i<(num.length+1);i++)
        {
            for(int j=0;j<(x+1);j++)
            {
                dp[i][j] = -1;
            }
        }
        int ans = value(0,num,x,dp);
        if(ans >= (int)Math.pow(10,9))
        return -1;
        else 
        return ans;
    }
    public static int value(int index,int[] num, int x,int[][] dp)
    {
        if(x==0)
        {
            return 0;
        }
        if(index==num.length)
        {
            return (int)Math.pow(10,9);
        }
        if(dp[index][x] != -1)
        {
            return dp[index][x];
        }
        int pick = (int)Math.pow(10,9);
        int npick = 0 + value(index+1,num,x,dp);
        if(num[index]<=x)
        pick = 1 + value(index,num,x-num[index],dp);
        return dp[index][x] = Math.min(pick,npick);
    }

}
