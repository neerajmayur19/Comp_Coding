class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int i,j;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        while(left<=right && top<=bottom)
        {
            if(left==right || top==bottom) // If the square has one row and one column at any point, the spiral matrix is nothing but all the remaining elements in order
            {
            for(i=top;i<=bottom;i++)
            {
                for(j=left;j<=right;j++)
                {
                    ans.add(matrix[i][j]);
                }
            }
            return ans;
            }
            ans.add(matrix[top][left]); // Adds the first element
            i = left+1;
            while(i<right)
            {
                ans.add(matrix[top][i]); // Goes from top left to top right by keeping top constant
                i++;
            }
            j = top;
            while(j<bottom)
            {
                ans.add(matrix[j][right]); // Goes from top right to bottom right by keeping right constant
                j++;
            }
            i = right;
            while(i>left)
            {
                ans.add(matrix[bottom][i]); // Goes from bottom right to bottom left by keeping bottom constant
                i--;
            }
            j = bottom;
            while(j>top)
            {
                ans.add(matrix[j][left]); // Goes from bottom left to top left by keepig left constant
                j--;
            }
            left += 1;
            right -= 1;
            top += 1;
            bottom -= 1;
        }
        return ans;
    }
}
