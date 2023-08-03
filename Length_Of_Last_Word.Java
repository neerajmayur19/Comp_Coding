class Solution {
    public int lengthOfLastWord(String s) {
        // Takes care of strings with one single character without any spaces
        if(s.length()==1)
        {
            return 1;
        }
        int n = s.length();
        // Cuts down all the spaces at the last
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i) != ' ')
            {
                s = s.substring(0,i+1);
                break;
            }
        }
        n = s.length();
        System.out.println(n);
        int index = -1;
        // Gives the index of the last possible space
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            index = i;
        }
        if(index!=-1)
        return (n-1-index); // Gives the final word length by subtracting the index of the last space from the total length of the string.
        else
        return n;
    }
}
