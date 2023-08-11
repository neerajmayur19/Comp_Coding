//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        HashSet<ArrayList<String>> s = new HashSet<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && vis[i][j] == 0)
                {
                    ArrayList<String> ne = new ArrayList<>();
                    BFS(i,j,grid,vis,ne,i,j);
                    s.add(ne);
                }
            }
        }
        //System.out.println(s);
        return s.size();
    }
    void BFS(int row,int col,int[][] grid, int[][] vis,ArrayList<String> str,int row0,int col0)
    {
        vis[row][col] = 1;
        str.add(toString(row-row0,col-col0));
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        for(int i=0;i<4;i++)
        {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==1 && vis[nrow][ncol]==0)
            {
                BFS(nrow,ncol,grid,vis,str,row0,col0);
            }
        }
    }
    String toString(int r,int c)
    {
        return Integer.toString(r) + " " + Integer.toString(c);
    }
}
