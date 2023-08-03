import java.util.* ;
import java.io.*; 
public class Solution {
    public static int targetSum(int n, int target, int[] arr) {
    	// Write your code here.
        return value(0,0,n,target,arr);
    }
    public static int value(int index,int sum,int n,int target, int[] arr)
    {
        if(index==arr.length)
        {
            if(sum==target)
            return 1;
            else
            return 0;
        }
        int pick = value(index+1,sum+arr[index],n,target,arr);
        int npick = value(index+1,sum-arr[index],n,target,arr);
        return pick+npick;
    }
}
