

// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
        int count = 0;
        while(N > 0)
        {
            int rem = N%2;
            if(rem==1)
            {
                count++;
            }
            N /= 2;
        }
        return count;
    }
}
