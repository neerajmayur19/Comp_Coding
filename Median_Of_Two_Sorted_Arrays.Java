class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[n+m];
        for(int i=0;i<m;i++)
        {
            temp[i] = nums1[i];
        }
        for(int i=0,j=m;i<n;i++,j++)
        {
            temp[j] = nums2[i];
        }
        Arrays.sort(temp);
        float solution;
        if((m+n)%2 != 0)
        {
            solution = temp[(int)(m+n)/2];
        }
        else
        {
            solution = (float)((temp[(m+n)/2] + temp[(m+n)/2 - 1]))/2;
        }
        return solution;
    }
}
