

//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int largest = maxine(arr,n);
        int j;
        int max = -1;
        for(j=0;j<n;j++)
        {
            if(j == largest || arr[j] == arr[largest])
            {
                continue;
            }
            // Skips the index of the largest number and checks for the largest number apart from that
                if(arr[j]>max)
                max = arr[j];
        }
        return max;
    }
    // finds the largest number of the array by traversing the array once
    int maxine(int [] arr, int n)
    {
        int i;
        int max = 0;
        for(i=0;i<n;i++)
        {
            if(arr[i]>arr[max])
            {
                max = i;
            }
        }
        return max;
    }
}
