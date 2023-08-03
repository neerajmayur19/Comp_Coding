class Solution {
    public int minLength(String s) {
        return value(s);
    }
    public int value(String s)
    {
        int count = 4;
        while(true)
        {
            if(s.contains("AB"))
            s = s.replace("AB","");
            if(s.contains("CD"))
            s = s.replace("CD","");
            //System.out.println(s);
            else
            {
                if(!(s.contains("AB") || s.contains("CD")))
                    break;
            }
        }
        System.out.println(s);
        return s.length();
    }
}
