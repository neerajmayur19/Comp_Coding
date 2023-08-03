class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> temp = new ArrayList<>();
        if(digits.length()==0)
        {
            return temp;
        }
        else if(digits.length()==1)
        {
            int value = digits.charAt(0) - '0';
            String s = values(value);
            for(int i=0;i<s.length();i++)
            {
                temp.add(s.substring(i,i+1));
            }
        }
        else if(digits.length()==2)
        {
            int value = digits.charAt(0) - '0';
            String s1 = values(value);
            value = digits.charAt(1) - '0';
            String s2 = values(value);
            temp = two(s1,s2);
        }
        else if(digits.length()==3)
        {
            int value = digits.charAt(0) - '0';
            String s1 = values(value);
            value = digits.charAt(1) - '0';
            String s2 = values(value);
            value = digits.charAt(2) - '0';
            String s3 = values(value);
            temp = three(s1,s2,s3);
        }
        else if(digits.length()==4)
        {
            int value = digits.charAt(0) - '0';
            String s1 = values(value);
            value = digits.charAt(1) - '0';
            String s2 = values(value);
            value = digits.charAt(2) - '0';
            String s3 = values(value);
            value = digits.charAt(3) - '0';
            String s4 = values(value);
            temp = four(s1,s2,s3,s4);
        }
        return temp;
    }
    public String values(int v)
    {
        if(v==2)
        return "abc";
        else if(v==3)
        return "def";
        else if(v==4)
        return "ghi";
        else if(v==5)
        return "jkl";
        else if(v==6)
        return "mno";
        else if(v==7)
        return "pqrs";
        else if(v==8)
        return "tuv";
        else if(v==9)
        return "wxyz";
    return "";
    }
    public List<String> two(String s1,String s2)
    {
        List<String> temp1 = new ArrayList<>();
        String temp = "";
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                temp = s1.charAt(i) + "" + s2.charAt(j);
                temp1.add(temp);
            }
        }
        return temp1;
    }
    public List<String> three(String s1,String s2,String s3)
    {
        List<String> temp1 = new ArrayList<>();
        String temp = "";
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                for(int k=0;k<s3.length();k++)
                {
                    temp = s1.charAt(i) + "" + s2.charAt(j) + "" + s3.charAt(k);
                    temp1.add(temp);
                }
            }
        }
        return temp1;
    }
    public List<String> four(String s1,String s2,String s3,String s4)
    {
        List<String> temp1 = new ArrayList<>();
        String temp = "";
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                for(int k=0;k<s3.length();k++)
                {
                    for(int z = 0;z<s4.length();z++)
                    {
                        temp = s1.charAt(i) + "" + s2.charAt(j) + "" + s3.charAt(k) + "" + s4.charAt(z);
                        temp1.add(temp);
                    }
                }
            }
        }
        return temp1;
    }

}
