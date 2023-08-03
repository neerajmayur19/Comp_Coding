class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        boolean stat = false;
        int rem;
        int sum = 0;
        if(x>=0)
        {
            while(x>0)
            {
                rem = x%10;
                sum = sum*10 + rem;
                x = x/10;
            }
            if(temp==sum)
            {
                stat = true;
            }
        }
        return stat;
    }
}
