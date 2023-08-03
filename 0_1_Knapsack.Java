

class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int[][] temp = new int[n+1][W+1];
         int i,j = 0;
         for(i=0;i<=n;i++)
         {
             for(j=0;j<=W;j++)
             {
                 if(i==0 || j==0)
                 {
                     temp[i][j] = 0;
                 }
                 else if(wt[i-1] <= j)
                 {
                     temp[i][j] = Math.max((temp[i-1][j - wt[i-1]] + val[i-1]),temp[i-1][j]);
                 }
                 else
                 {
                     temp[i][j] = temp[i-1][j];
                 }
             }
         }
         return temp[n][W];
    } 
}
