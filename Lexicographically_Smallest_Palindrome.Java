class Solution {
    public String makeSmallestPalindrome(String s) {
        int n = s.length()-1;
        for(int i=0;i<(s.length()/2);i++)
        {
            if(s.charAt(i)==s.charAt(n-i))
                continue;
            else
            {
                if(s.charAt(i)<s.charAt(n-i))
                    s = s.substring(0,n-i) + s.charAt(i) + s.substring(n-i+1,n+1);
                else
                    s = s.substring(0,i) + s.charAt(n-i) + s.substring(i+1,n+1);

            }
        }
        return s;
    }
}
