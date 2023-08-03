

class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long p1 = 1;
        long p2 = 1;
        long product = maxine(arr,n);
        for(int i=0,j=n-1;i<n;i++,j--)
        {
            p1 = p1*arr[i];
            p2 = p2*arr[j];
            product = Math.max(Math.max(p1,product),p2);
            if(arr[i] == 0)
            {
                p1 = 1;
            }
            if(arr[j] == 0)
            {
                p2 = 1;
            }
        }
        return product;
    }
    int maxine(int [] arr, int n)
    {
        int i;
        int max = arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
