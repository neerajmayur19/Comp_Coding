class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        int count = (n+1)/2;
        if(nums1.length>nums2.length)
        return findMedianSortedArrays(nums2,nums1);
        int low = 0;
        int high = nums1.length;
        while (low <= high) {
        int mid1 = (low + high) / 2;
        int mid2 = count - mid1;
        
        // Get the values of l1, l2, r1, r2
        int l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
        int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
        int r1 = (mid1 == nums1.length) ? Integer.MAX_VALUE : nums1[mid1];
        int r2 = (mid2 == nums2.length) ? Integer.MAX_VALUE : nums2[mid2];
        
        if (l1 > r2) {
            high = mid1 - 1;
        } else if (l2 > r1) {
            low = mid1 + 1;
        } else {
            if (n % 2 == 0) {
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            } else {
                return Math.max(l1, l2);
            }
        }
    }
    return 0.0;
    }
}
