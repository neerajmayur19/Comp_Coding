

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int max(int a,int b)
    {
        if(a>b)
        return a;
        else
        return b;
    }
        long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int i;
        int sum = 0;
        int maxi = arr[0];
        for(i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            maxi = max(sum,maxi);
            if(sum < 0)
            sum = 0;
        }
        return maxi;
    }
    
}
