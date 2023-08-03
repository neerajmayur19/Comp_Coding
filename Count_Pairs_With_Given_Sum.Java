
//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int[] freq = new int[1999991];
        boolean[] f = new boolean[1999991];
        frequency(arr,freq,n);
        truth(arr,f,n);
        int count = 0;
        int i;
        for(i=0;i<n;i++)
        {
            if((arr[i] == k-arr[i]) && f[arr[i]] == true)
            {
                int sum = 0;
                if(freq[arr[i]] > 1)
                {
                    for(int j=0;j<freq[arr[i]];j++)
                    {
                        sum += j;
                    }
                    count += sum;
                }
                f[arr[i]] = false;
            }
            if(f[arr[i]] == true && (k-arr[i]) > 0 && f[k-arr[i]] == true)
            {
                count += freq[arr[i]] * freq[k-arr[i]];
                f[arr[i]] = false;
                f[k-arr[i]] = false;
            }
        }
        return count;
        
    }
    void frequency(int arr[], int freq[], int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
    }
    void truth(int arr[], boolean[] f, int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            f[arr[i]] = true;
        }
    }
}
