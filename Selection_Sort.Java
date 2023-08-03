

class Solution
{
	void selectionSort(int arr[], int n)
	{
	    int temp;
	    int min;
	    //code here
	    for(int i=0;i<n;i++)
	    {
	        min = arr[i];
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[j]<min)
	            {
	                min = arr[j];
	                temp = arr[i];
	                arr[i] =arr[j];
	                arr[j] =temp;
	            }
	        }
	    }
	}
}
