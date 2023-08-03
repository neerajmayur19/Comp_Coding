class Solution {
    public String simplifyPath(String path) {
        /*
        Cheat codes for this question are:
        1) . means keep continuing 
        2) .. means remove the directory before that
        3) // means remove multiple slashes to make it as one single slash
        */ 
        String result = "/";
        Stack<String> ans = new Stack<>();
        // This iteration puts all the strings seperately between / and /.
        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i)=='/')
            {
                continue;
            }
            else
            {
                String temp = new String("");
                while(i<path.length() && path.charAt(i)!='/')
                {
                    temp += path.charAt(i);
                    i++;
                }
                ans.add(temp);
            }
        }
        // Now the elements of the stack are nothing but folder names,. or ..
        System.out.println(ans);
        result = compute_answer(ans,result);
        return result;
    }
    public String compute_answer(Stack<String> ans, String result)
    {
        int count = 0;
        Stack<String> reverse_ans = new Stack<>();
        String x = new String("");
        while(!(ans.isEmpty()))
        {
            String temp = ans.peek();
            if(temp.equals(".")) // Skips if the present element is .
            {
                x = ans.pop();
            }
            else if(temp.equals(".."))
            {
                x = ans.pop();
                count++;
            }
            else
            {
                if(count==0)
                {
                    x = ans.pop();
                    reverse_ans.add(x);
                }
                else
                {
                    if(!(ans.isEmpty()))
                    {
                        x = ans.pop();
                        count--;
                    }
                }
            }
        }
        while(!(reverse_ans.isEmpty()))
        {
            x = reverse_ans.pop();
            result += x;
            if(!(reverse_ans.isEmpty()))
            {
                result += '/';
            }
        }
        return result;
    }
}
