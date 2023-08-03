

//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> r = new ArrayList<Integer>();
        HashSet<Integer> t1 = new HashSet<Integer>();
        HashSet<Integer> t2 = new HashSet<Integer>();
        HashSet<Integer> t3 = new HashSet<Integer>();
        for(int i=0;i<n1;i++)
        {
            t1.add(A[i]);
        }
        for(int i=0;i<n2;i++)
        {
            if(t1.contains(B[i]))
            {
                t2.add(B[i]);
            }
        }
        for(int i=0;i<n3;i++)
        {
            if(t2.contains(C[i]) && !(t3.contains(C[i])))
            {
                r.add(C[i]);
                t3.add(C[i]);
            }
        }
        return r;
    }
}
