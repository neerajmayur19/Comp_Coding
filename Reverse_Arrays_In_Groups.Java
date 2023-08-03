

//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int i;
        int left,right;
        for(i=0;i<n;i=i+k)
        {
            left = i;
            right = Math.min(i+k-1,n-1);
            while(left<right)
            {
                Collections.swap(arr,left,right);
                left++;
                right--;
            }
        }
    }
}
