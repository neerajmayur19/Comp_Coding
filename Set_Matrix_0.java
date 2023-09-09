class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        int row0 = 1;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(i==0)
                    row0 = 0;
                    else
                    matrix[i][0] = 0;
                    if(j==0)
                    col0 = 0;
                    else
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i<m;i++)
        {
            if(matrix[i][0]==0)
            {
                setzero(matrix,i);
            }
        }
        for(int i=1;i<n;i++)
        {
            if(matrix[0][i]==0)
            {
                setzerot(matrix,i);
            }
        }
        if(row0==0)
        {
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[0][i] = 0;
            }
        }
        if(col0==0)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][0] = 0;
            }
        }
        //finalcheck(matrix);
    }
    public void setzero(int[][] matrix, int row)
    {
        for(int i=1;i<matrix[0].length;i++)
        {
            matrix[row][i] = 0;
        }
    }
    public void setzerot(int[][] matrix, int col)
    {
        for(int i=1;i<matrix.length;i++)
        {
            matrix[i][col] = 0;
        }
    }
    /*public void finalcheck(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][1]==0)
            matrix[i][0] = 0;
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            if(matrix[1][i]==0)
            matrix[0][i] = 0;
        }
    }*/
}
