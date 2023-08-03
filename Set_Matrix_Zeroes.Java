class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row_count = new ArrayList<>();
        ArrayList<Integer> col_count = new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(!(row_count.contains(i)))
                    {
                        row_count.add(i);
                    }
                    if(!(col_count.contains(j)))
                    {
                        col_count.add(j);
                    }

                }
            }
        }
        for(int i=0;i<row_count.size();i++)
        {
            int value = row_count.get(i);
            set_row_to_zero(matrix,value);
        }
        for(int i=0;i<col_count.size();i++)
        {
            int value = col_count.get(i);
            set_col_to_zero(matrix,value);
        }
    }
    public void set_row_to_zero(int[][] matrix,int row)
    {
        for(int i=0;i<matrix[0].length;i++)
        {
            matrix[row][i] = 0;
        }
    }
    public void set_col_to_zero(int[][] matrix,int col)
    {
        for(int i=0;i<matrix.length;i++)
        {
            matrix[i][col] = 0;
        }
    }
}
