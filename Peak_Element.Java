

/*Complete the function below*/

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int i = 0;
       int a;
       if(n==1)
       {
           return 0;
       }
       else
       {
           a = -1;
       }
        if(arr[i]>=arr[i+1])
           {
               a = 0;
           }
       for(i=1;i<n-1;i++)
       {
           if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
           {
               a = i;
               break;
           }
       }
        i = n-1;
        if(arr[i]>=arr[i-1])
        {
            a=i;
        }
       return a;
    }
}
