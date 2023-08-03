class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> temp = new ArrayList<>();
        int i = 0;
        int[][] n1 = new int[intervals.length+1][2];
        for(i=0;i<intervals.length;i++)
        {
            n1[i][0] = intervals[i][0];
            n1[i][1] = intervals[i][1];
        }
        n1[i][0] = newInterval[0];
        n1[i][1] = newInterval[1];
        Arrays.sort(n1,(a,b)->(a[0]-b[0]));
        int start = n1[0][0];
        int end = n1[0][1];
        for(i=1;i<n1.length;i++)
        {
            if(n1[i][0]<=end)
            end = Math.max(end,n1[i][1]);
            else
            {
                temp.add(new int[]{start,end});
                start = n1[i][0];
                end = n1[i][1];
            }
        }
        temp.add(new int[]{start,end});
        return temp.toArray(new int[0][]);
    }
}
