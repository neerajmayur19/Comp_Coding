class Solution {
    public String minWindow(String s, String t) {
        String ans = "";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        int total_count = 0;
        int reqd_count = t.length();
        
        int i = -1;
        int j = -1;
        while(true)
        {
            // Acquire 
            boolean flag1 = false;
            boolean flag2 = false;


            while(i<s.length()-1 && total_count<reqd_count)
            {
                i++;
                char ch = s.charAt(i);
                map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
                if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch,0))
                {
                    total_count++;
                }
                flag1 = true;
            }

            // Store and release
            while(j<i && total_count==reqd_count)
            {
                String path = s.substring(j+1,i+1);
                if(ans.length()==0 || path.length()<ans.length())
                {
                    ans = path;
                }
                j++;
                char ch = s.charAt(j);
                if(map1.get(ch)==1)
                {
                    map1.remove(ch);
                }
                else
                {
                    map1.put(ch,map1.get(ch)-1);
                }


                if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0))
                {
                    total_count--;
                }
                flag2 = true;
            }

            if(flag1==false && flag2 == false)
            {
                break;
            }    
        }
        return ans;
    }
}
