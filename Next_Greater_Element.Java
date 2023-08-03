

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] t = new long[n];
        Stack<Long> s = new Stack<Long>();
        t[n-1] = -1;
        s.push(0l);
        for(int i=n-1;i>=0;i--)
        {
            while(!(s.isEmpty()) && s.peek() <= arr[i])
            {
                s.pop();
            }
            if(!(s.isEmpty()))
            {
                t[i] = s.peek();
                s.push(arr[i]);
            }
            else
            {
                t[i] = -1;
                s.push(arr[i]);
            }
        }
        return t;
    } 
}
