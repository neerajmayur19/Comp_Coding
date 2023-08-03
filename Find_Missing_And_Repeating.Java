

// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] n1 = new int[2];
        boolean[] t = new boolean[n+1];
        HashSet<Integer> t1 = new HashSet<Integer>();
        t1.add(0);
        for(int i=0;i<n;i++)
        {
            if(t1.contains(arr[i]))
            {
                n1[0] = arr[i];
                break;
            }
            t1.add(arr[i]);
        }
        stat(t,arr,n);
        for(int i=1;i<=n;i++)
        {
            if(t[i] == false)
            {
                n1[1] = i;
                break;
            }
        }
        return n1;
        
    }
    void stat(boolean[] t, int[] arr, int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            t[arr[i]] = true;
        }
    }
}
