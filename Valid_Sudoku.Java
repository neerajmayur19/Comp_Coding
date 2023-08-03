class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean stat = true;
        int n = 9;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='.')
                continue;
                else
                stat = valid(i,j,board,n);
                if(stat==false)
                return stat;
            }
        }
        return stat;
    }
    public boolean valid(int row, int col, char[][] board,int n)
    {
        int drow = row;
        int dcol = col;
        row++;
        while(row < n)
        {
            if(board[drow][dcol] == board[row][col])
            return false;
            row++;
        }
        row = drow;
        col = dcol;
        col++;
        while(col < n)
        {
            if(board[drow][dcol] == board[row][col])
            return false;
            col++;
        }
        for(int i=0;i<7;i=i+3)
        {
            HashSet<Integer> temp = new HashSet<>();
            for(int k=i;k<=(i+2);k++)
            {
            for(int j=0;j<=2;j++)
            {
                if(board[k][j]=='.')
                continue;
                else
                {
                    if(temp.contains(board[k][j] - '0'))
                    return false;
                    else
                    temp.add(board[k][j]-'0');
                }
            }
            }
        }
        for(int i=0;i<7;i=i+3)
        {
            HashSet<Integer> temp = new HashSet<>();
            for(int k=i;k<=(i+2);k++)
            {
            for(int j=3;j<=5;j++)
            {
                if(board[k][j]=='.')
                continue;
                else
                {
                    if(temp.contains(board[k][j] - '0'))
                    return false;
                    else
                    temp.add(board[k][j]-'0');
                }
            }
            }
        }
        for(int i=0;i<9;i=i+3)
        {
            HashSet<Integer> temp = new HashSet<>();
            for(int k=i;k<=(i+2);k++)
            {
            for(int j=6;j<=8;j++)
            {
                if(board[k][j]=='.')
                continue;
                else
                {
                    if(temp.contains(board[k][j] - '0'))
                    return false;
                    else
                    temp.add(board[k][j]-'0');
                }
            }
            }
        }
        return true;
    }
}
