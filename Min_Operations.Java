

class Solution {
    public static int solve(int a, int b) {
        // code here
        if(a==b)
        {
            return 0;
        }
        else
        {
            int x = a&b;
            int c = a&x;
            int d = b&x;
            if(c==a && c!=b)
            {
                return 1;
            }
            else if(c==b && c!=a)
            {
                return 1;
            }
            else if(c==a && c==b)
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
    }
}
        
