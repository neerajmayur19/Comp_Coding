

// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int i;
        int max = arr[n-1];
        int min = arr[0];
        int ans = max - min;
        for(i=1;i<n;i++)
        {
            if(arr[i]-k < 0)
            {
                continue;
            }
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[0]+k,arr[i]-k);
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
}
