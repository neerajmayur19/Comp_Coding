class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            if(target==matrix[i][0] || target==matrix[i][matrix[0].length-1])
            {
                return true;
            }
            else if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1])
            {
                return (BinarySearch(matrix,i,0,matrix[0].length-1,target));
            }
        }
        return false;
    }
    public boolean BinarySearch(int[][] matrix,int row,int low,int high,int target)
    {
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(matrix[row][mid] == target)
            {
                return true;
            }
            else if(matrix[row][mid] < target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return false;
    }
}
