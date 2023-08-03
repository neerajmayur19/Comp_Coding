class Solution {
    public List<List<String>> partition(String s) {
        List<String> temp = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        solve(0,s,temp,res);
        return res;
    }
    public void solve(int index, String s, List<String> temp, List<List<String>> res)
    {
        if(index==s.length())
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();i++)
        {
            if(palindrome(s,index,i))
            {
                temp.add(s.substring(index,i+1));
                solve(i+1,s,temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean palindrome(String s, int left, int right)
    {
        while(left < right)
        {
            if(s.charAt(left)!=s.charAt(right))
            return false;
            left++;
            right--;
        }
        return true;
    }
}
