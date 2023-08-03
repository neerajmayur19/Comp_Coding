class Solution {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length-1;
        // Makes use of 4 pointers to make sure all the elements are rotated corner by corner.
        while(left<right)
        {
            for(int i=0;i<(right-left);i++)
            {
                int top = left;
                int bottom = right;
                int temp = matrix[top][left+i];
                matrix[top][left+i] = matrix[bottom-i][left];
                matrix[bottom-i][left] = matrix[bottom][right-i];
                matrix[bottom][right-i] = matrix[top+i][right];
                matrix[top+i][right] = temp;
            }
            left++;
            right--;
        }
    }
}
