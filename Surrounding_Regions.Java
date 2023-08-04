class Solution {
    public void solve(char[][] board) {
        int[][] vis = new int[board.length][board[0].length];
        for(int j=0;j<board[0].length;j++)
        {
            if(board[0][j] == 'O')
            DFS(board,0,j,vis);
            if(board[board.length-1][j] == 'O')
            DFS(board,board.length-1,j,vis);
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][0] == 'O')
            DFS(board,i,0,vis);
            if(board[i][board[0].length-1] == 'O')
            DFS(board,i,board[0].length-1,vis);
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(vis[i][j] == 0 && board[i][j] == 'O')
                board[i][j] = 'X';
            }
        }
    }
    public void DFS(char[][] board,int row,int col,int[][] vis)
    {
        vis[row][col] = 1;
        //Upward
        if(row-1>=0 && col>=0 && row<board.length && col<board[0].length && board[row-1][col] == 'O' && vis[row-1][col] == 0)
        {
            DFS(board,row-1,col,vis);
        }
        //Rightward
        if(row>=0 && col>=0 && row<board.length && col+1<board[0].length && board[row][col+1] == 'O' && vis[row][col+1] == 0)
        {
            DFS(board,row,col+1,vis);
        }
        //Downward
        if(row>=0 && col>=0 && row+1<board.length && col<board[0].length && board[row+1][col] == 'O' && vis[row+1][col] == 0)
        {
            DFS(board,row+1,col,vis);
        }
        //Leftward
        if(row>=0 && col-1>=0 && row<board.length && col-1<board[0].length && board[row][col-1] == 'O' && vis[row][col-1] == 0)
        {
            DFS(board,row,col-1,vis);
        }
    }
}
