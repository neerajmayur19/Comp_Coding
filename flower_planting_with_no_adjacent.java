class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        boolean[][] adjacency_matrix = new boolean[n+1][n+1];
        for(int i=0;i<paths.length;i++)
        {
            adjacency_matrix[paths[i][0]][paths[i][1]] = true;
            adjacency_matrix[paths[i][1]][paths[i][0]] = true;
        }
        int[] colors = new int[n+1];
        boolean value = valid(1,adjacency_matrix,colors,n);
        int[] subArray = Arrays.copyOfRange(colors, 1, colors.length);
        return subArray;
    }
    public boolean valid(int index, boolean[][] adjacency_matrix, int[] colors,int n)
    {
        if(index==n+1)
        return true;
        for(int i=1;i<=4;i++)
        {
            if(valid_number(index,i,adjacency_matrix,colors,n))
            {
                colors[index] = i;
                if(valid(index+1,adjacency_matrix,colors,n)==true)
                return true;
                else
                colors[index] = 0;
            }
        }
        return false;
    }
    public boolean valid_number(int index, int color, boolean[][] adjacency_matrix,int[] colors, int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(adjacency_matrix[index][i] && colors[i]==color)
            return false;
        }
        return true;
    }
}
