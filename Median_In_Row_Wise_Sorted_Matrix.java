public final class Solution {
    public static int findMedian(int matrix[][], int m, int n) {
        // Write your code here
        int low = 0;
        int high = 1000000009;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int count = 0;
            for(int i=0;i<m;i++)
            {
                count += findElementsSmaller(matrix[i],mid,n);
            }
            if(count<=(m*n)/2)
            low = mid+1;
            else
            high = mid-1;
        }
        return low;
    }
    public static int findElementsSmaller(int[] matrix, int element, int n)
    {
        int start = 0;
        int end = n-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(matrix[mid]<=element)
            start = mid+1;
            else
            end = mid-1;
        }
        return start;
    }
}
