class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initial_value = image[sr][sc];
        boolean[][] vis = new boolean[image.length][image[0].length];
        DFS(image,sr,sc,vis,initial_value,color);
        return image;
    }
    public void DFS(int[][] image,int sr,int sc,boolean[][] vis,int initial_value,int final_value)
    {
        vis[sr][sc] = true;
        image[sr][sc] = final_value;
        // Right direction
        if(sc+1<image[0].length && vis[sr][sc+1] == false && image[sr][sc+1]==initial_value)
        {
            DFS(image,sr,sc+1,vis,initial_value,final_value);
        }
        // Downwards direction
        if(sr+1<image.length && vis[sr+1][sc] == false && image[sr+1][sc]==initial_value)
        {
            DFS(image,sr+1,sc,vis,initial_value,final_value);
        }
        // Left direction
        if(sc-1>=0 && vis[sr][sc-1] == false && image[sr][sc-1]==initial_value)
        {
            DFS(image,sr,sc-1,vis,initial_value,final_value);
        }
        // Upwards direction
        if(sr-1>=0 && vis[sr-1][sc] == false && image[sr-1][sc]==initial_value)
        {
            DFS(image,sr-1,sc,vis,initial_value,final_value);
        }
    }
}
