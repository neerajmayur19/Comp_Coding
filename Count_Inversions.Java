

//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        return mergesort(arr,0,arr.length-1);
    }
    static long mergesort(long arr[], int l, int h)
    {
        long count = 0;
        long inv_count;
        if(l<h)
        {
            int mid = (l+h)/2;
            count += mergesort(arr,l,mid);
            count += mergesort(arr,mid+1,h);
            count += merge(arr,l,mid,h);
        }
        return count;
    }
    static long merge(long arr[], int l, int mid, int h)
    {
        long count = 0;
        int i,j,k;
        int n1 = mid-l+1;
        int n2 = h-mid;
        long[] arr1 = new long[n1];
        long[] arr2 = new long[n2];
        for(i=0;i<n1;i++)
        {
            arr1[i] = arr[l+i];
        }
        for(i=0;i<n2;i++)
        {
            arr2[i] = arr[mid+1+i];
        }
        i=0;
        j=0;
        k = l;
        while(i<n1 && j<n2)
        {
            if(arr1[i] <= arr2[j])
            {
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                count += (mid+1) - (l+i);
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            count += (mid+1) - (l+i);
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return count;
    }
}
