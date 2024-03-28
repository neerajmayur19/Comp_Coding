class Solution {
    public int minCut(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return valid_min_cut(0,s,dp)-1;
    }
    public int valid_min_cut(int index, String s, int[] dp)
    {
        if(index==s.length())
        return 0;
        if(dp[index] != -1)
        return dp[index];
        int cost = 0;
        int min_cost = Integer.MAX_VALUE;
        for(int j=index;j<s.length();j++)
        {
            if(valid(s,index,j))
            cost = 1 + valid_min_cut(j+1,s,dp);
            min_cost = Math.min(min_cost,cost);
        }
        return dp[index] = min_cost;
    }
    public boolean valid(String s, int index1, int index2)
    {
        int left = index1;
        int right = index2;
        while(left<right)
        {
            if(!(s.charAt(left)==s.charAt(right)))
            return false;
            left++;
            right--;
        }
        return true;
    }
}
