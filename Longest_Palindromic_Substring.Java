class Solution {
    public String longestPalindrome(String s) {
        String temp = "";
        int longest = 0;
        int left,right;
        for(int i=0;i<s.length();i++)
        {
            // Odd Length
            left = i;
            right = i;
            while(left>=0 && right < s.length() && s.charAt(left)==s.charAt(right))
            {
                if((right-left+1)>longest)
                {
                    longest = right - left + 1;
                    temp = s.substring(left,right+1);
                }
                left--;
                right++;
            }
            // Palindromes with even length
            left = i;
            right = i+1;
            while(left>=0 && right <= s.length()-1 && s.charAt(left)==s.charAt(right))
            {
                if((right-left+1)>longest)
                {
                    longest = right - left + 1;
                    temp = s.substring(left,right+1);
                }
                left--;
                right++;
            }

        }
        return temp;
    }
}
