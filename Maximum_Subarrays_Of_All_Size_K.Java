

//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int i,j;
        int max;
        for(i=0;i<=(n-k);i++)
        {
            max = arr[i];
            for(j=i;j<(i+k);j++)
            {
                if(arr[j]>max)
                {
                    max = arr[j];
                }
            }
            temp.add(max);
        }
        return temp;
    }
}
