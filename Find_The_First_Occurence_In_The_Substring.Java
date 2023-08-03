class Solution {
    public int strStr(String haystack, String needle) {
        int stat = -1;
        int reqd = needle.length();
        for(int i=0;i<haystack.length();i++)
        {
            if((i+reqd-1)<haystack.length() && (haystack.charAt(i) == needle.charAt(0)) && haystack.charAt(i+reqd-1) == needle.charAt(reqd-1))
            {
                if(haystack.substring(i,i+reqd).equals(needle))
                {
                    stat = i;
                    break;
                }
            }
        }
        return stat;
    }
}
