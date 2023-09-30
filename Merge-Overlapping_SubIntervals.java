import java.util.*;

public class Solution {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        // Write your code here.
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List< List< Integer > > ans = new ArrayList<>();
        int i = 0;
        for(i=0;i<arr.length;i++)
        {
        if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<arr[i][0])
        {
            ans.add(Arrays.asList(arr[i][0],arr[i][1]));
        }
        else
        {
            ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
        }
        }
        return ans;
    }
}
