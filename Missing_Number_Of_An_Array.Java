

// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int i;
        int a = 0;
        boolean[] flag = new boolean[2*n];
        for(i=0;i<=n;i++)
        {
            flag[i+1] = false;
        }
        for(i=0;i<n-1;i++)
        {
            flag[array[i]] = true;
        }
        for(i=0;i<n;i++)
        {
            if(flag[i+1] == false)
            {
                a = i+1;
                break;
            }
        }
        return a;
    }
}
