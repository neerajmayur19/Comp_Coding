


class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here
        String temp = "";
        int count = 0;
        int[] index = new int[100009];
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i) == '.')
            {
                count++;
                index[count] = i;
            }
        }
        if(count == 0)
        {
            return S;
        }
        temp += S.substring(index[count]+1);
        count--;
        while(count > 0)
        {
            temp = temp + S.substring(index[count],index[count+1]);
            count--;
        }
        temp = temp + "." + S.substring(0,index[count + 1]);
        return temp;
        
    }
}
