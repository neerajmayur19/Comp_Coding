class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<Character>();
        boolean t = true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                temp.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')')
            {
                if(!(temp.empty()) && temp.peek()=='(')
                {
                    temp.pop();
                }
                else
                {
                    t = false;
                    break;
                }
            }
            else if(s.charAt(i) == ']')
            {
                if(!(temp.empty()) && temp.peek()=='[')
                {
                    temp.pop();
                }
                else
                {
                    t = false;
                    break;
                }
            }
            else if(s.charAt(i) == '}')
            {
                if(!(temp.empty()) && temp.peek()=='{')
                {
                    temp.pop();
                }
                else
                {
                    t = false;
                    break;
                }
            }
            else
            {
                break;
            }
        }
        if(!(temp.isEmpty()))
        t = false;
        return t;
    }
}
