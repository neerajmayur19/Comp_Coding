
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        char x1;
        int i;
        Stack<Character> s = new Stack<Character>();
        boolean a = true;
        for(i=0;i<x.length();i++)
        {
            if(x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '[')
            {
                s.push(x.charAt(i));
            }
            else if(x.charAt(i) == ']')
            {
                if(s.empty())
                {
                a = false;
                break;
                }
                x1 = s.pop();
                if(x1 != '[')
                {
                    a = false;
                    break;
                }
            }
            else if(x.charAt(i) == ')')
            {
                if(s.empty())
                {
                a = false;
                break;
                }
                x1 = s.pop();
                if(x1 != '(')
                {
                    a = false;
                    break;
                }
            }
            else if(x.charAt(i) == '}')
            {
                if(s.empty())
                {
                a = false;
                break;
                }
                x1 = s.pop();
                if(x1 != '{')
                {
                    a = false;
                    break;
                }
            }
        }
        if(s.empty())
        return a;
        else
        {
            a = false;
            return a;
        }
    }
}
