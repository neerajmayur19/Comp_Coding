class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> temp = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
        int[] leftrow = new int[n];
        int[] ld = new int[2*n - 1];
        int[] ud = new int[2*n - 1];
        solve(0,board,temp,leftrow,ld,ud,n);
        return temp;
    }
    void solve(int col, char[][] board, List<List<String>> ans, int[] leftrow, int[]ld, int[] ud, int n)
    {
        if(col==board.length)
        {
            ans.add(construct(board));
            return;
        }
        for(int row = 0;row < n;row++)
        {
            if(leftrow[row]==0 && ld[row+col]==0 && ud[n-1+col-row]==0)
            {
                leftrow[row] = 1;
                ld[row+col] = 1;
                ud[(n-1) + (col-row)] = 1;
                board[row][col] = 'Q';
                solve(col+1,board,ans,leftrow,ld,ud,n);
                board[row][col] = '.';
                leftrow[row] = 0;
                ld[row+col] = 0;
                ud[(n-1) + (col-row)] = 0;
            }
            
        }
    }
    List<String> construct(char[][] board)
    {
        List<String> temp = new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String s = new String(board[i]);
            temp.add(s);
        }
        return temp;
    }
}
