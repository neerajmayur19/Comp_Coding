class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        int fact = 1;
        for(int i=1;i<n;i++)
        {
            arr.add(i);
            fact = fact*i;
        }
        arr.add(n);
        String result = "";
        k--;
        while(result.length() < n)
        {
            result += Integer.toString(arr.get(k/fact));
            arr.remove(k/fact);
            if(arr.size()==0)
            br
            k = k%fact;
            fact = fact/arr.size();
        }
        return result;
    }
}
