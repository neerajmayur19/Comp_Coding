class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> ans = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            ans.add(s.charAt(i));
        }
        return ans.size();
    }
}
