

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int i,j,k;
         int n1 = m-l+1;
         int n2 = r-m;
         int[] arr1 = new int[n1];
         int[] arr2 = new int[n2];
         for(i=0;i<n1;i++)
         {
             arr1[i] = arr[l+i];
         }
         for(j=0;j<n2;j++)
         {
             arr2[j] = arr[1+m+j];
         }
         i=0;
         j=0;
         k=l;
         while(i<n1 && j<n2)
         {
             if(arr1[i] < arr2[j])
             {
                 arr[k] = arr1[i];
                 k++;
                 i++;
             }
             else
             {
                 arr[k] = arr2[j];
                 k++;
                 j++;
             }
         }
         while(i<n1)
         {
             arr[k] = arr1[i];
             k++;
             i++;
         }
         while(j<n2)
         {
             arr[k] = arr2[j];
             k++;
             j++;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
       if(l<r)
       {//code here
        int mid = (l + (r-l)/2);
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
       }
        
    }
}
