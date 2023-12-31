//User function Template for Java
class Solution{
    public static long distinctColoring(int N, int[]r, int[]g, int[]b){
        //code here
        long x = r[0];
        long y = g[0];
        long z = b[0];
        for(int i=1;i<N;i++){
            long x1= x;
            long y1 = y;
            long z1 =z;
            x = r[i] +Math.min(y1,z1);
            y = g[i]+Math.min(x1,z1);
            z = b[i]+Math.min(x1,y1);
        }
        return Math.min(x,Math.min(y,z));
    }
}
