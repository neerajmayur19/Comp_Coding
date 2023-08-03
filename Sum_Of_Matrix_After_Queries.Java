class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        int row = n,col = n;
        long sum = 0;
        HashSet<Integer> row_map = new HashSet<>();
        HashSet<Integer> col_map = new HashSet<>();
        for(int i=queries.length-1;i>=0;i--)
        {
            if(queries[i][0]==0)
            {
                if(row<=0 || row_map.contains(queries[i][1]))
                continue;
                row_map.add(queries[i][1]);
                sum += col*(queries[i][2]);
                row--;
            }
            else
            {
                if(col<=0 || col_map.contains(queries[i][1]))
                continue;
                col_map.add(queries[i][1]);
                sum += row*(queries[i][2]);
                col--;
            }
        }
        return sum;
    }
}
