import java.util.*;
public class Solution {
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        return (Mergesort(a,0,n-1));
    }
    public static int Mergesort(int[] a, int low, int high)
    {
        int inv_count = 0;
        if(low < high)
        {
            int mid = (low+high)/2;
            inv_count += Mergesort(a,low,mid);
            inv_count += Mergesort(a,mid+1,high);
            inv_count += merge(a,low,mid,high);      
        }
        return inv_count;
    }
    public static int merge(int[] a, int low, int mid, int high)
    {
        List<Integer> temp = new ArrayList<Integer>();
        int i = low;
        int j = mid+1;
        int k = 0;
        int inv_count = 0;
        while(i<=mid && j<=high)
        {
            if(a[i]<=a[j])
            {
                temp.add(a[i]);
                i++;
            }
            else
            {
                temp.add(a[j]);
                inv_count += (mid-i) +1;
                j++;
            }
        }
        while(i<=mid)
        {
            temp.add(a[i]);
            i++;
        }
        while(j<=high)
        {
            temp.add(a[j]);
            j++;
        }
        for(int z=low;z<=high;z++)
        {
            a[z] = temp.get(k);
            k++;
        }
        return inv_count;
    }
}
