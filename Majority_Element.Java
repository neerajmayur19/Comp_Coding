

//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int[] freq = new int[10000000];
        for(int i=0;i<size;i++)
        {
            freq[a[i]]++;
            if(freq[a[i]] > size/2)
            {
                return a[i];
            }
        }
        return -1;
    }
}
