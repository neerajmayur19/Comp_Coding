class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> temp = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        if(intervals.length==0 || intervals==null)
        return temp.toArray(new int[0][]);
        
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=end)
            {
                end = Math.max(end,intervals[i][1]);
            }
            else
            {
                temp.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        temp.add(new int[]{start,end});
        return temp.toArray(new int[0][]);
    }
}
