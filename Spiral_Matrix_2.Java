class Solution {
    public int[][] generateMatrix(int n) {
        int[][] temp = new int[n][n];
        int count = 1;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        while(left<=right && top<=bottom)
        {
            if(left==right || top==bottom)
            {
                for(int i=top;i<=bottom;i++)
                {
                    for(int j=left;j<=right;j++)
                    {
                        temp[i][j] = count;
                        count++;
                    }
                }
                break;
            }
            temp[top][left] = count;
            count++;
            for(int i=left+1;i<right;i++)
            {
                temp[top][i] = count;
                count++;
            }
            for(int i=top;i<bottom;i++)
            {
                temp[i][right] = count;
                count++;
            }
            for(int i=right;i>left;i--)
            {
                temp[bottom][i] = count;
                count++;
            }
            for(int i=bottom;i>top;i--)
            {
                temp[i][left] = count;
                count++;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return temp;
    }
}
