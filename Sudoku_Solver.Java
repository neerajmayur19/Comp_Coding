class Solution {
    public void solveSudoku(char[][] board) {
        boolean t = solve(board);
    }
    boolean solve(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] == '.')
                {
                    for(char c = '1';c<='9';c++)
                    {
                        if(valid(i,j,board,c))
                        {
                            board[i][j] = c;
                            if(solve(board)==true)
                            return true;
                            else
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean valid(int row, int col, char[][] board, char c)
    {
        for(int i=0;i<9;i++)
        {
            if(board[i][col] == c)
            return false;
            if(board[row][i]==c)
            return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3] == c)
            return false;
        }
        return true;
    }
}
